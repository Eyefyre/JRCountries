/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restcountriesjava.client;

import com.google.gson.JsonElement;
import com.restcountriesjava.cache.InMemoryCache;
import com.restcountriesjava.model.Country;
import java.util.ArrayList;

/**
 *
 * @author Adam
 */
public interface CountryServiceInterface {

    InMemoryCache getCache();

    void changeCacheTime(long seconds);

    ArrayList<Country> parseJSONtoObject(String jsonString);

    ArrayList<Country> getResource(String path);

    ArrayList<Country> queryAPI(String path);

    Country parser(JsonElement element);

}
