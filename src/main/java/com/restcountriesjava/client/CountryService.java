/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restcountriesjava.client;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.restcountriesjava.cache.InMemoryCache;
import com.restcountriesjava.model.Country;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.HttpsURLConnection;

/**
 *
 * @author Adam
 */
public class CountryService implements CountryServiceInterface {

    private final InMemoryCache CACHE = new InMemoryCache();
    private final String BASEURL = "https://restcountries.eu/rest/v2/";
    private String JSONSTRING = "";
    private final GsonBuilder BUILDER = new GsonBuilder();
    private final Gson gson = BUILDER.create();
    private long cacheTimeInSeconds = 5;


    @Override
    public ArrayList<Country> getResource(String path) {
        Object list = queryAPI(path);
        CACHE.add(path, list, cacheTimeInSeconds * 1000);
        return (ArrayList<Country>) list;
    }

    @Override
    public ArrayList<Country> queryAPI(String path) {
        try {
            JSONSTRING = "";
            URL url = new URL(BASEURL + path);
            HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.11 (KHTML, like Gecko) Chrome/23.0.1271.95 Safari/537.11");
            conn.setRequestProperty("Content-Type", "application/json");
            conn.connect();
            StringBuilder content = new StringBuilder();
            try (BufferedReader in = new BufferedReader(
                    new InputStreamReader(conn.getInputStream()))) {
                String inputLine;
                while ((inputLine = in.readLine()) != null) {
                    content.append(inputLine);
                }
            }
            JSONSTRING = content.toString();
            conn.disconnect();
        } catch (MalformedURLException ex) {
            Logger.getLogger(CountryService.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(CountryService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return parseJSONtoObject(JSONSTRING);
    }

    @Override
    public ArrayList<Country> parseJSONtoObject(String jsonString) {
        ArrayList<Country> list = new ArrayList<>();
        JsonArray jsonelement = JsonParser.parseString(jsonString).getAsJsonArray();
        if (jsonelement.isJsonArray()) {
            for (JsonElement el : jsonelement) {
                list.add(parser(el));
            }

        }
        return list;
    }

    @Override
    public Country parser(JsonElement element) {
        JsonObject e = element.getAsJsonObject().getAsJsonObject("translations");
        Set keys = e.keySet();
        JsonArray array = new JsonArray();
        for (Object key : keys) {
            String value = e.get(key.toString()).toString();
            JsonObject translation = new JsonObject();
            translation.addProperty("translation", value);
            translation.addProperty("language", key.toString());
            array.add(translation);

        }
        JsonObject elem = element.getAsJsonObject();
        elem.remove("translations");
        elem.add("translations", array);
        Country country = gson.fromJson(elem.toString(), Country.class);
        return country;
    }
    
    @Override
    public InMemoryCache getCache() {
        return CACHE;
    }

    @Override
    public void changeCacheTime(long seconds) {
        this.cacheTimeInSeconds = seconds;
    }

}
