/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Adam
 */
public class Country {

    String cca2;
    String ccn3;
    String cca3;
    String cioc;
    boolean independent;
    String status;
    boolean unMember;
    String region;
    String subregion;
    boolean landlocked;
    Double area;
    String flag;
    int population;
    String fifa;
    String startOfWeek;
    PictureResource coatOfArms;
    PictureResource flags;
    ArrayList<Double> latlng;
    CapitalInfo capitalInfo;
    ArrayList<String> continents;
    ArrayList<String> timezones;
    Car car;
    MapResource maps;
    ArrayList<String> borders;
    ArrayList<String> capital;
    IDD idd;
    ArrayList<String> altSpellings;
    ArrayList<String> tld;

    CountryName name;
    ArrayList<Currency> currencies;
    ArrayList<Demonym> demonyms;
    ArrayList<Language> languages;
    ArrayList<CountryNameResource> translations;
    Gini gini;
    PostalCode postalCode;

    public PostalCode getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(PostalCode postalCode) {
        this.postalCode = postalCode;
    }
    
    

    public String getCca2() {
        return cca2;
    }

    public String getCcn3() {
        return ccn3;
    }

    public String getCca3() {
        return cca3;
    }

    public String getCioc() {
        return cioc;
    }

    public boolean isIndependent() {
        return independent;
    }

    public String getStatus() {
        return status;
    }

    public boolean isUnMember() {
        return unMember;
    }

    public String getRegion() {
        return region;
    }

    public String getSubregion() {
        return subregion;
    }

    public boolean isLandlocked() {
        return landlocked;
    }

    public Double getArea() {
        return area;
    }

    public String getFlag() {
        return flag;
    }

    public int getPopulation() {
        return population;
    }

    public String getFifa() {
        return fifa;
    }

    public String getStartOfWeek() {
        return startOfWeek;
    }

    public PictureResource getCoatOfArms() {
        return coatOfArms;
    }

    public PictureResource getFlags() {
        return flags;
    }

    public ArrayList<Double> getLatlng() {
        return latlng;
    }

    public CapitalInfo getCapitalInfo() {
        return capitalInfo;
    }

    public ArrayList<String> getContinents() {
        return continents;
    }

    public ArrayList<String> getTimezones() {
        return timezones;
    }

    public Car getCar() {
        return car;
    }

    public MapResource getMaps() {
        return maps;
    }

    public ArrayList<String> getBorders() {
        return borders;
    }

    public ArrayList<String> getCapital() {
        return capital;
    }

    public IDD getIdd() {
        return idd;
    }

    public ArrayList<String> getAltSpellings() {
        return altSpellings;
    }

    public ArrayList<String> getTld() {
        return tld;
    }

    public CountryName getName() {
        return name;
    }

    public ArrayList<Currency> getCurrencies() {
        return currencies;
    }

    public ArrayList<Demonym> getDemonyms() {
        return demonyms;
    }

    public ArrayList<Language> getLanguages() {
        return languages;
    }

    public ArrayList<CountryNameResource> getTranslations() {
        return translations;
    }

    public Gini getGini() {
        return gini;
    }

    public void setCca2(String cca2) {
        this.cca2 = cca2;
    }

    public void setCcn3(String ccn3) {
        this.ccn3 = ccn3;
    }

    public void setCca3(String cca3) {
        this.cca3 = cca3;
    }

    public void setCioc(String cioc) {
        this.cioc = cioc;
    }

    public void setIndependent(boolean independent) {
        this.independent = independent;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setUnMember(boolean unMember) {
        this.unMember = unMember;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setSubregion(String subregion) {
        this.subregion = subregion;
    }

    public void setLandlocked(boolean landlocked) {
        this.landlocked = landlocked;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public void setFifa(String fifa) {
        this.fifa = fifa;
    }

    public void setStartOfWeek(String startOfWeek) {
        this.startOfWeek = startOfWeek;
    }

    public void setCoatOfArms(PictureResource coatOfArms) {
        this.coatOfArms = coatOfArms;
    }

    public void setFlags(PictureResource flags) {
        this.flags = flags;
    }

    public void setLatlng(ArrayList<Double> latlng) {
        this.latlng = latlng;
    }

    public void setCapitalInfo(CapitalInfo capitalInfo) {
        this.capitalInfo = capitalInfo;
    }

    public void setContinents(ArrayList<String> continents) {
        this.continents = continents;
    }

    public void setTimezones(ArrayList<String> timezones) {
        this.timezones = timezones;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void setMaps(MapResource maps) {
        this.maps = maps;
    }

    public void setBorders(ArrayList<String> borders) {
        this.borders = borders;
    }

    public void setCapital(ArrayList<String> capital) {
        this.capital = capital;
    }

    public void setIdd(IDD idd) {
        this.idd = idd;
    }

    public void setAltSpellings(ArrayList<String> altSpellings) {
        this.altSpellings = altSpellings;
    }

    public void setTld(ArrayList<String> tld) {
        this.tld = tld;
    }

    public void setName(CountryName name) {
        this.name = name;
    }

    public void setCurrencies(ArrayList<Currency> currencies) {
        this.currencies = currencies;
    }

    public void setDemonyms(ArrayList<Demonym> demonyms) {
        this.demonyms = demonyms;
    }

    public void setLanguages(ArrayList<Language> languages) {
        this.languages = languages;
    }

    public void setTranslations(ArrayList<CountryNameResource> translations) {
        this.translations = translations;
    }

    public void setGini(Gini gini) {
        this.gini = gini;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Country{cca2=").append(cca2);
        sb.append(", ccn3=").append(ccn3);
        sb.append(", cca3=").append(cca3);
        sb.append(", cioc=").append(cioc);
        sb.append(", independent=").append(independent);
        sb.append(", status=").append(status);
        sb.append(", unMember=").append(unMember);
        sb.append(", region=").append(region);
        sb.append(", subregion=").append(subregion);
        sb.append(", landlocked=").append(landlocked);
        sb.append(", area=").append(area);
        sb.append(", flag=").append(flag);
        sb.append(", population=").append(population);
        sb.append(", fifa=").append(fifa);
        sb.append(", startOfWeek=").append(startOfWeek);
        sb.append(", coatOfArms=").append(coatOfArms);
        sb.append(", flags=").append(flags);
        sb.append(", latlng=").append(latlng);
        sb.append(", capitalInfo=").append(capitalInfo);
        sb.append(", continents=").append(continents);
        sb.append(", timezones=").append(timezones);
        sb.append(", car=").append(car);
        sb.append(", maps=").append(maps);
        sb.append(", borders=").append(borders);
        sb.append(", capital=").append(capital);
        sb.append(", idd=").append(idd);
        sb.append(", altSpellings=").append(altSpellings);
        sb.append(", tld=").append(tld);
        sb.append(", name=").append(name);
        sb.append(", currencies=").append(currencies);
        sb.append(", demonyms=").append(demonyms);
        sb.append(", languages=").append(languages);
        sb.append(", translations=").append(translations);
        sb.append(", gini=").append(gini);
        sb.append(", postalCode=").append(postalCode);
        sb.append('}');
        return sb.toString();
    }
    
    

}
