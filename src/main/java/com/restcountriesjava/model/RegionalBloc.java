/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restcountriesjava.model;

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

    public String getAcronym() {
        return acronym;
    }

    public String getName() {
        return name;
    }

    public ArrayList<String> getOtherAcronyms() {
        return otherAcronyms;
    }

    public ArrayList<String> getOtherNames() {
        return otherNames;
    }

    @Override
    public String toString() {
        return "RegionalBloc{" + "acronym=" + acronym + ", name=" + name + ", otherAcronyms=" + otherAcronyms + ", otherNames=" + otherNames + '}';
    }

}
