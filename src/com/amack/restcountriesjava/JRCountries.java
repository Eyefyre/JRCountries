/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amack.restcountriesjava;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.amack.model.Country;
import com.amack.model.Currency;
import com.amack.model.Language;
import com.amack.model.RegionalBloc;
import com.amack.model.Translation;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Adam
 */
public class JRCountries {

    private static final String BASEURL = "https://restcountries.eu/rest/v2/";
    private static String resultString = "";

    /**
     * Returns an ArrayList of Country objects.
     * This method parses all the relevant data out of the JSONArray for each country returned.
     * The data is put into a country object and added to an ArrayList. This ArrayList is then returned.
     *
     * @param countries A JSONArray that has been returned from the API query.
     * @return ArrayList of Countries
     * @see Country
     */
    private static ArrayList<Country> populateCountriesFromJSON(JSONArray countries) {
        ArrayList<Country> results = new ArrayList<>();
        for (Object cou : countries) {
            JSONObject countryJSONObj = (JSONObject) cou;
            String countryName = populateString(countryJSONObj, "name");//Country Name
            String alpha2Code = populateString(countryJSONObj, "alpha2Code");//alpha2 code
            String alpha3Code = populateString(countryJSONObj, "alpha3Code");//apha3 code
            String capital = populateString(countryJSONObj, "capital");//capital
            String region = populateString(countryJSONObj, "region");//region
            String subregion = populateString(countryJSONObj, "subregion");//subregion
            String demonym = populateString(countryJSONObj, "demonym");//demonym
            String flag = populateString(countryJSONObj, "flag");//flag
            String cioc = populateString(countryJSONObj, "cioc");//cioc
            String nativeName = populateString(countryJSONObj, "nativeName");//nativeName
            String numericCode = populateString(countryJSONObj, "numericCode");//numericCode

            ArrayList<String> countryTopLevelDomains = populateArrayList(countryJSONObj, "topLevelDomain");//Top Level Domain        
            ArrayList<String> countrycallingCodes = populateArrayList(countryJSONObj, "callingCodes");//calling codes
            ArrayList<String> countryAltSpellings = populateArrayList(countryJSONObj, "altSpellings");//alt spellings          
            ArrayList<String> countryTimezones = populateArrayList(countryJSONObj, "timezones");//timezones
            ArrayList<String> countryBorders = populateArrayList(countryJSONObj, "borders");//borders

            ArrayList<Currency> countryCurrency = generateCurrency(countryJSONObj);//currencies
            ArrayList<Language> countryLanguage = generateLanguage(countryJSONObj);//Language
            ArrayList<Translation> countryTranslation = generateTranslation(countryJSONObj);//translations
            ArrayList<RegionalBloc> countrybloc = generateRegionalBloc(countryJSONObj);//regionalbloc

            int population = Integer.parseInt(countryJSONObj.get("population").toString());//population
            //latitudelongitude
            JSONArray latlng = (JSONArray) countryJSONObj.get("latlng");
            double latitude = 0.0, longitude = 0.0, area = 0.0, gini = 0.0;
            if (!latlng.isEmpty()) {
                latitude = Double.valueOf(latlng.get(0).toString());
                longitude = Double.valueOf(latlng.get(1).toString());
            }
            //area
            if (countryJSONObj.get("area") != null) {
                area = Double.valueOf(countryJSONObj.get("area").toString());
            }
            //gini
            if (countryJSONObj.get("gini") != null) {
                gini = Double.valueOf(countryJSONObj.get("gini").toString());
            }

            Country country = new Country(countryName, countryTopLevelDomains, alpha2Code, alpha3Code, countrycallingCodes, capital, countryAltSpellings, region, subregion, population, latitude, longitude, demonym, area, gini, countryTimezones, countryBorders, nativeName, numericCode, countryCurrency, countryLanguage, countryTranslation, flag, countrybloc, cioc);
            results.add(country);
        }
        return results;
    }

    private static String populateString(JSONObject obj, String JSONArea) {
        return String.valueOf(obj.get(JSONArea));
    }

    private static ArrayList<Language> generateLanguage(JSONObject obj) {
        ArrayList<Language> countryLanguage = new ArrayList<>();
        JSONArray language = (JSONArray) obj.get("languages");
        for (Object st : language) {
            JSONObject lan = (JSONObject) st;
            String languageName = String.valueOf(lan.get("name"));
            String languageNativeName = String.valueOf(lan.get("nativeName"));
            String languageiso639_2 = String.valueOf(lan.get("iso639_2"));
            String languageiso639_1 = String.valueOf(lan.get("iso639_1"));
            Language lang = new Language(languageiso639_1, languageiso639_2, languageName, languageNativeName);
            countryLanguage.add(lang);
        }
        return countryLanguage;
    }

    private static ArrayList<Currency> generateCurrency(JSONObject obj) {
        ArrayList<Currency> countryCurrency = new ArrayList<>();
        JSONArray currency = (JSONArray) obj.get("currencies");
        for (Object st : currency) {
            JSONObject cur = (JSONObject) st;
            String currencyCode = String.valueOf(cur.get("code"));
            String currencyName = String.valueOf(cur.get("name"));
            String currencySymbol = String.valueOf(cur.get("symbol"));
            Currency currenc = new Currency(currencyCode, currencyName, currencySymbol);
            countryCurrency.add(currenc);
        }
        return countryCurrency;
    }

    private static ArrayList<Translation> generateTranslation(JSONObject obj) {
        ArrayList<Translation> countryTranslation = new ArrayList<>();
        JSONObject translation = (JSONObject) obj.get("translations");
        for (Object st : translation.keySet()) {
            Translation count = new Translation(st.toString(), String.valueOf(translation.get(st.toString())));
            countryTranslation.add(count);
        }
        return countryTranslation;
    }

    private static ArrayList<RegionalBloc> generateRegionalBloc(JSONObject obj) {
        ArrayList<RegionalBloc> countrybloc = new ArrayList<>();
        JSONArray bloc = (JSONArray) obj.get("regionalBlocs");
        for (Object st : bloc) {
            JSONObject blo = (JSONObject) st;
            String blocAcronym = blo.get("acronym").toString();
            String blocName = blo.get("name").toString();
            ArrayList<String> otherAcros = new ArrayList<>();
            JSONArray acros = (JSONArray) blo.get("otherAcronyms");
            for (Object ac : acros) {
                otherAcros.add(String.valueOf(ac));
            }
            ArrayList<String> otherNames = new ArrayList<>();
            JSONArray names = (JSONArray) blo.get("otherNames");
            for (Object ac : names) {
                otherAcros.add(String.valueOf(ac));
            }

            RegionalBloc newbloc = new RegionalBloc(blocAcronym, blocName, otherAcros, otherNames);
            countrybloc.add(newbloc);
        }
        return countrybloc;
    }

    private static ArrayList<String> populateArrayList(JSONObject obj, String JSONArea) {
        ArrayList<String> data = new ArrayList<>();
        JSONArray JSONarray = (JSONArray) obj.get(JSONArea);
        for (Object st : JSONarray) {
            data.add(st.toString());
        }
        return data;
    }

    /**
     * Queries the API, and returns a the parsed JSON data in an ArrayList of Country objects
     * 
     * @param URLAddition A String specifying which directory should be accessed when querying the API
     * @return ArrayList of Countries
     * @see Country
     */
    private static ArrayList<Country> queryCountries(String URLAddition) {
        ArrayList<Country> results = new ArrayList<>();
        try {
            resultString = "";
            URL url = new URL(BASEURL + URLAddition);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();
            int responsecode = conn.getResponseCode();
            if (responsecode != 200) {
                throw new RuntimeException("Response" + responsecode);
            } else {
                try (Scanner sc = new Scanner(url.openStream())) {
                    while (sc.hasNext()) {
                        resultString += sc.nextLine();
                    }
                }
            }
            JSONParser parse = new JSONParser();
            JSONArray jobj = (JSONArray) parse.parse(resultString);
            results = populateCountriesFromJSON(jobj);
        } catch (MalformedURLException | ProtocolException | ParseException ex) {
            Logger.getLogger(JRCountries.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(JRCountries.class.getName()).log(Level.SEVERE, null, ex);
        }
        return results;
    }

    
    
    /**
     * Returns an ArrayList of Country objects.
     * This method returns all the countries.
     *
     * @return ArrayList of Countries
     * @see Country
     */
    public static ArrayList<Country> getAllCountries() {
        return queryCountries("all");
    }
    
    /**
     * Returns an ArrayList of Country objects whose name matches the given name .
     * This method returns all the countries whose name matches the given name.
     * Example: Ireland, Japan, China
     *
     * @param name A String specifying which countries to return based on the given value
     * @return ArrayList of Countries
     * @see Country
     */
    public static ArrayList<Country> getCountryByName(String name) {
        return queryCountries("name/" + name);
    }

    /**
     * Returns an ArrayList of Country objects whose name matches the given name exactly.
     * This method returns all the countries whose name matches the given name exactly.
     * Example: Ireland, Japan, China
     *
     * @param name A String specifying which countries to return based on the given value
     * @return ArrayList of Countries
     * @see Country
     */
    public static ArrayList<Country> getCountryByFullName(String name) {
        return queryCountries("name/" + name + "?fullText=true");
    }

    /**
     * Returns an ArrayList of Country objects that has the given country code
     * This method returns all the countries that has the given country code
     * Search term must be an ISO 3166-1 2-letter or 3-letter country code
     * Example: COL, IE, GB
     *
     * @param code A String specifying which countries to return based on the given value
     * @return ArrayList of Countries
     * @see Country
     */
    public static ArrayList<Country> getCountryByCode(String code) {
        return queryCountries("alpha/" + code);
    }

    /**
     * Returns an ArrayList of Country objects that have any of the given country codes
     * This method returns all the countries that have any of the given country codes
     * Search term must ISO 3166-1 2-letter or 3-letter country codes separated by semi-colons
     * Example: col;no;ee
     *
     * @param codeList A String specifying which countries to return based on the given value
     * @return ArrayList of Countries
     * @see Country
     */
    public static ArrayList<Country> getCountryByCodeList(String codeList) {
        return queryCountries("alpha?codes=" + codeList);
    }

    /**
     * Returns an ArrayList of Country objects that use a given currency
     * This method returns all the countries that have a given currency
     * Search term must an ISO 4217 currency code
     * Example: EUR, USD, JPY
     *
     * @param currency A String specifying which countries to return based on the given value
     * @return ArrayList of Countries
     * @see Country
     */
    public static ArrayList<Country> getCountryByCurrency(String currency) {
        return queryCountries("currency/" + currency);
    }

    /**
     * Returns an ArrayList of Country objects that use a given language
     * This method returns all the countries that have a given language
     * Search term must an ISO 639-1 language code
     * Example: EN, ES, DE
     *
     * @param lang A String specifying which countries to return based on the given value
     * @return ArrayList of Countries
     * @see Country
     */
    public static ArrayList<Country> getCountryByLanguage(String lang) {
        return queryCountries("lang/" + lang);
    }

    /**
     * Returns an ArrayList of Country objects that have a given capital
     * This method returns all the countries that have a given capital
     * Example: London, Paris, Moscow
     *
     * @param capital A String specifying which countries to return based on the given value
     * @return ArrayList of Countries
     * @see Country
     */
    public static ArrayList<Country> getCountryByCapitalCity(String capital) {
        return queryCountries("capital/" + capital);
    }

    /**
     * Returns an ArrayList of Country objects that have a given calling code
     * This method returns all the countries that have a given calling code
     * Example: 86, 353, 44
     *
     * @param callingCode A String specifying which countries to return based on the given value
     * @return ArrayList of Countries
     * @see Country
     */
    public static ArrayList<Country> getCountryByCallingCode(String callingCode) {
        return queryCountries("callingcode/" + callingCode);
    }

    /**
     * Returns an ArrayList of Country objects that belong in the given region
     * This method returns all the countries that belong to the given region
     * Example: Example: Africa, Europe, Asia
     *
     * @param region A String specifying which countries to return based on the
     * given value
     * @return ArrayList of Countries
     * @see Country
     */
    public static ArrayList<Country> getCountryByRegion(String region) {
        return queryCountries("region/" + region);
    }

    /**
     * Returns an ArrayList of Country objects that belong in the given Regional
     * Bloc This method returns all the countries that belong to the given regional bloc.
     * Example: EU, EEU, ASEAN
     *
     * @param bloc A String specifying which countries to return based on the
     * given value
     * @return ArrayList of Countries
     * @see Country
     */
    public static ArrayList<Country> getCountryByRegionalBloc(String bloc) {
        return queryCountries("regionalbloc/" + bloc);
    }

}
