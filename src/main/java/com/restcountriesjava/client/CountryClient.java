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
public class CountryClient implements CountryClientInterface {

    private final CountryService countryService = new CountryService();

    @Override
    public void changeCacheTimeAmount(long seconds) {
        this.countryService.changeCacheTime(seconds);
    }

    private ArrayList<Country> useService(String path) {
        if (countryService.getCache().contains(path)) {
            System.out.println("CacheGet");
            return (ArrayList<Country>) countryService.getCache().get(path);
        }
        System.out.println("APIGet");
        return countryService.getResource(path);
    }

    @Override
    public ArrayList<Country> getAllCountries() {
        return useService("all");
    }

    @Override
    public ArrayList<Country> getCountryByName(String name) {
        return useService("name/" + name);
    }

    @Override
    public ArrayList<Country> getCountryByFullName(String name) {
        return useService("name/" + name + "?fulltext=true");
    }

    @Override
    public ArrayList<Country> getCountryByCode(String code) {
        return useService("alpha/" + code);
    }

    @Override
    public ArrayList<Country> getCountryByCodeList(String codeList) {
        return useService("alpha?codes=" + codeList);
    }

    @Override
    public ArrayList<Country> getCountryByCurrency(String currency) {
        return useService("currency/" + currency);
    }

    @Override
    public ArrayList<Country> getCountryByLanguage(String lang) {
        return useService("lang/" + lang);
    }

    @Override
    public ArrayList<Country> getCountryByCapitalCity(String capital) {
        return useService("capital/" + capital);
    }

    @Override
    public ArrayList<Country> getCountryByCallingCode(String callingCode) {
        return useService("callingcode/" + callingCode);
    }

    @Override
    public ArrayList<Country> getCountryByRegion(String region) {
        return useService("region/" + region);
    }

    @Override
    public ArrayList<Country> getCountryByRegionalBloc(String bloc) {
        return useService("regionalbloc/" + bloc);
    }

}
