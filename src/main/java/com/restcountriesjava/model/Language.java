/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restcountriesjava.model;

/**
 *
 * @author Adam
 */
public class Language {

    public String iso639_1;
    public String iso639_2;
    public String name;
    public String nativeName;

    public String getIso639_1() {
        return iso639_1;
    }

    public String getIso639_2() {
        return iso639_2;
    }

    public String getName() {
        return name;
    }

    public String getNativeName() {
        return nativeName;
    }

    @Override
    public String toString() {
        return "Language{" + "iso639_1=" + iso639_1 + ", iso639_2=" + iso639_2 + ", name=" + name + ", nativeName=" + nativeName + '}';
    }

}
