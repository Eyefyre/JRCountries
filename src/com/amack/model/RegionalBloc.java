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
public class RegionalBloc {
    public String acronym;
    public String name;
    public ArrayList<String> otherAcronyms;
    public ArrayList<String> otherNames;

    public RegionalBloc(String acronym, String name, ArrayList<String> otherAcronyms, ArrayList<String> otherNames) {
        this.acronym = acronym;
        this.name = name;
        this.otherAcronyms = otherAcronyms;
        this.otherNames = otherNames;
    }

    public String getAcronym() {
        return acronym;
    }

    public void setAcronym(String acronym) {
        this.acronym = acronym;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getOtherAcronyms() {
        return otherAcronyms;
    }

    public void setOtherAcronyms(ArrayList<String> otherAcronyms) {
        this.otherAcronyms = otherAcronyms;
    }

    public ArrayList<String> getOtherNames() {
        return otherNames;
    }

    public void setOtherNames(ArrayList<String> otherNames) {
        this.otherNames = otherNames;
    }

    @Override
    public String toString() {
        return "RegionalBloc{" + "acronym=" + acronym + ", name=" + name + ", otherAcronyms=" + otherAcronyms + ", otherNames=" + otherNames + '}';
    }
    
    
}
