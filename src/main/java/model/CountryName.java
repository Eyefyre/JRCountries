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
public class CountryName {

    String common;
    String official;
    ArrayList<CountryNameResource> nativeName;

    public String getCommon() {
        return common;
    }

    public void setCommon(String common) {
        this.common = common;
    }

    public String getOfficial() {
        return official;
    }

    public void setOfficial(String official) {
        this.official = official;
    }

    public ArrayList<CountryNameResource> getNativeName() {
        return nativeName;
    }

    public void setNativeName(ArrayList<CountryNameResource> nativeName) {
        this.nativeName = nativeName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CountryName{common=").append(common);
        sb.append(", official=").append(official);
        sb.append(", nativeName=").append(nativeName);
        sb.append('}');
        return sb.toString();
    }

    
    
}
