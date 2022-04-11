/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Adam
 */
public class CountryNameResource {

    String cca3;
    String official;
    String common;

    public String getCca3() {
        return cca3;
    }

    public void setCca3(String cca3) {
        this.cca3 = cca3;
    }

    public String getOfficial() {
        return official;
    }

    public void setOfficial(String official) {
        this.official = official;
    }

    public String getCommon() {
        return common;
    }

    public void setCommon(String common) {
        this.common = common;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CountryNameResource{cca3=").append(cca3);
        sb.append(", official=").append(official);
        sb.append(", common=").append(common);
        sb.append('}');
        return sb.toString();
    }
    
    
}
