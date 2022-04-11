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
public class Car {

    ArrayList<String> signs;
    String side;

    public ArrayList<String> getSigns() {
        return signs;
    }

    public void setSigns(ArrayList<String> signs) {
        this.signs = signs;
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Car{signs=").append(signs);
        sb.append(", side=").append(side);
        sb.append('}');
        return sb.toString();
    }

}
