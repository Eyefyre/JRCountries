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
public class Demonym {

    String language;
    String f;
    String m;

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getF() {
        return f;
    }

    public void setF(String f) {
        this.f = f;
    }

    public String getM() {
        return m;
    }

    public void setM(String m) {
        this.m = m;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Demonym{language=").append(language);
        sb.append(", f=").append(f);
        sb.append(", m=").append(m);
        sb.append('}');
        return sb.toString();
    }

}
