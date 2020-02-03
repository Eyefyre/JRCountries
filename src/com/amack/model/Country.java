/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amack.model;

import java.util.ArrayList;

/**
 *
 * @author Adam
 */
public class Country {
    private String name;
    private ArrayList<String> topLevelDomain;
    private String alpha2Code;
    private String alpha3Code;
    private ArrayList<String> callingCodes;
    private String capital;
    private ArrayList<String> altSpellings;
    private String region;
    private String subregion;
    private int population;
    private double latitude;
    private double longitude;
    private String demonym;
    private double area;
    private double gini;
    private ArrayList<String> timezones;
    private ArrayList<String> borders;
    private String nativeName;
    private String numericCode;
    private ArrayList<Currency> currencies;
    private ArrayList<Language> languages;
    private ArrayList<Translation> translations;
    private String Flag;
    private ArrayList<RegionalBloc> regionalBlocs;
    private String cioc;

    public Country(String name, ArrayList<String> topLevelDomain, String alpha2Code, String alpha3Code, ArrayList<String> callingCodes, String capital, ArrayList<String> altSpellings, String region, String subregion, int population, double latitude, double longitude, String demonym, double area, double gini, ArrayList<String> timezones, ArrayList<String> borders, String nativeName, String numericCode, ArrayList<Currency> currencies, ArrayList<Language> languages, ArrayList<Translation> translations, String Flag, ArrayList<RegionalBloc> regionalBlocs, String cioc) {
        this.name = name;
        this.topLevelDomain = topLevelDomain;
        this.alpha2Code = alpha2Code;
        this.alpha3Code = alpha3Code;
        this.callingCodes = callingCodes;
        this.capital = capital;
        this.altSpellings = altSpellings;
        this.region = region;
        this.subregion = subregion;
        this.population = population;
        this.latitude = latitude;
        this.longitude = longitude;
        this.demonym = demonym;
        this.area = area;
        this.gini = gini;
        this.timezones = timezones;
        this.borders = borders;
        this.nativeName = nativeName;
        this.numericCode = numericCode;
        this.currencies = currencies;
        this.languages = languages;
        this.translations = translations;
        this.Flag = Flag;
        this.regionalBlocs = regionalBlocs;
        this.cioc = cioc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getTopLevelDomain() {
        return topLevelDomain;
    }

    public void setTopLevelDomain(ArrayList<String> topLevelDomain) {
        this.topLevelDomain = topLevelDomain;
    }

    public String getAlpha2Code() {
        return alpha2Code;
    }

    public void setAlpha2Code(String alpha2Code) {
        this.alpha2Code = alpha2Code;
    }

    public String getAlpha3Code() {
        return alpha3Code;
    }

    public void setAlpha3Code(String alpha3Code) {
        this.alpha3Code = alpha3Code;
    }

    public ArrayList<String> getCallingCodes() {
        return callingCodes;
    }

    public void setCallingCodes(ArrayList<String> callingCodes) {
        this.callingCodes = callingCodes;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public ArrayList<String> getAltSpellings() {
        return altSpellings;
    }

    public void setAltSpellings(ArrayList<String> altSpellings) {
        this.altSpellings = altSpellings;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getSubregion() {
        return subregion;
    }

    public void setSubregion(String subregion) {
        this.subregion = subregion;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getDemonym() {
        return demonym;
    }

    public void setDemonym(String demonym) {
        this.demonym = demonym;
    }

    public double getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public double getGini() {
        return gini;
    }

    public void setGini(int gini) {
        this.gini = gini;
    }

    public ArrayList<String> getTimezones() {
        return timezones;
    }

    public void setTimezones(ArrayList<String> timezones) {
        this.timezones = timezones;
    }

    public ArrayList<String> getBorders() {
        return borders;
    }

    public void setBorders(ArrayList<String> borders) {
        this.borders = borders;
    }

    public String getNativeName() {
        return nativeName;
    }

    public void setNativeName(String nativeName) {
        this.nativeName = nativeName;
    }

    public String getNumericCode() {
        return numericCode;
    }

    public void setNumericCode(String numericCode) {
        this.numericCode = numericCode;
    }

    public ArrayList<Currency> getCurrencies() {
        return currencies;
    }

    public void setCurrencies(ArrayList<Currency> currencies) {
        this.currencies = currencies;
    }

    public ArrayList<Language> getLanguages() {
        return languages;
    }

    public void setLanguages(ArrayList<Language> languages) {
        this.languages = languages;
    }

    public ArrayList<Translation> getTranslations() {
        return translations;
    }

    public void setTranslations(ArrayList<Translation> translations) {
        this.translations = translations;
    }

    public String getFlag() {
        return Flag;
    }

    public void setFlag(String Flag) {
        this.Flag = Flag;
    }

    public ArrayList<RegionalBloc> getRegionalBlocs() {
        return regionalBlocs;
    }

    public void setRegionalBlocs(ArrayList<RegionalBloc> regionalBlocs) {
        this.regionalBlocs = regionalBlocs;
    }

    public String getCioc() {
        return cioc;
    }

    public void setCioc(String cioc) {
        this.cioc = cioc;
    }

    @Override
    public String toString() {
        return "Country{" + "name=" + name + ", topLevelDomain=" + topLevelDomain + ", alpha2Code=" + alpha2Code + ", alpha3Code=" + alpha3Code + ", callingCodes=" + callingCodes + ", capital=" + capital + ", altSpellings=" + altSpellings + ", region=" + region + ", subregion=" + subregion + ", population=" + population + ", latitude=" + latitude + ", longitude=" + longitude + ", demonym=" + demonym + ", area=" + area + ", gini=" + gini + ", timezones=" + timezones + ", borders=" + borders + ", nativeName=" + nativeName + ", numericCode=" + numericCode + ", currencies=" + currencies + ", languages=" + languages + ", translations=" + translations + ", Flag=" + Flag + ", regionalBlocs=" + regionalBlocs + ", cioc=" + cioc + '}';
    }
    

    
    
}
