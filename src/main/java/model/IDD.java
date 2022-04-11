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
public class IDD {

    String root;
    ArrayList<String> suffixes;

    public String getRoot() {
        return root;
    }

    public void setRoot(String root) {
        this.root = root;
    }

    public ArrayList<String> getSuffixes() {
        return suffixes;
    }

    public void setSuffixes(ArrayList<String> suffixes) {
        this.suffixes = suffixes;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("IDD{root=").append(root);
        sb.append(", suffixes=").append(suffixes);
        sb.append('}');
        return sb.toString();
    }

}
