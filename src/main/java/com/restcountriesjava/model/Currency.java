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
public class Currency {

    public String code;
    public String name;
    public String symbol;

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getSymbol() {
        return symbol;
    }

    @Override
    public String toString() {
        return "Currency{" + "code=" + code + ", name=" + name + ", symbol=" + symbol + '}';
    }

}
