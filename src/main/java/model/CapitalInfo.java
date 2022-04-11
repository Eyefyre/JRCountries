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
public class CapitalInfo {

    ArrayList<Double> latlng;

    public ArrayList<Double> getLatlng() {
        return latlng;
    }

    public void setLatlng(ArrayList<Double> latlng) {
        this.latlng = latlng;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CapitalInfo{latlng=").append(latlng);
        sb.append('}');
        return sb.toString();
    }

}
