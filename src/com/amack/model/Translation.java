/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amack.model;

/**
 *
 * @author Adam
 */
public class Translation {
    public String language;
    public String translation;

    public Translation(String language, String translation) {
        this.language = language;
        this.translation = translation;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getTranslation() {
        return translation;
    }

    public void setTranslation(String translation) {
        this.translation = translation;
    }

    @Override
    public String toString() {
        return "Translation{" + "language=" + language + ", translation=" + translation + '}';
    }
    
    
    
}
