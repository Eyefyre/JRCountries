/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restcountriesjava.client;

import com.restcountriesjava.model.Country;
import java.util.ArrayList;

/**
 *
 * @author Adam
 */
public interface CountryClientInterface {

    void changeCacheTimeAmount(long seconds);

    ArrayList<Country> getAllCountries();

    ArrayList<Country> getCountryByName(String name);

    ArrayList<Country> getCountryByFullName(String name);

    ArrayList<Country> getCountryByCode(String code);

    ArrayList<Country> getCountryByCodeList(String codeList);

    ArrayList<Country> getCountryByCurrency(String currency);

    ArrayList<Country> getCountryByLanguage(String lang);

    ArrayList<Country> getCountryByCapitalCity(String capital);

    ArrayList<Country> getCountryByCallingCode(String callingCode);

    ArrayList<Country> getCountryByRegion(String region);

    ArrayList<Country> getCountryByRegionalBloc(String bloc);
}
