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
public class Translation {

    public String language;
    public String translation;

    public String getLanguage() {
        return language;
    }

    public String getTranslation() {
        return translation;
    }

    @Override
    public String toString() {
        return "Translation{" + "language=" + language + ", translation=" + translation + '}';
    }

}
