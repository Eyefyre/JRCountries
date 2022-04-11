/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cache;

import java.util.ArrayList;
import model.Country;

/**
 *
 * @author Adam
 */
public interface Cache {

    void add(String key, ArrayList<Country> value, long periodInMillis);

    void remove(String key);

    ArrayList<Country> get(String key);

    void clear();

    long size();
    
    boolean contains(String key);
}
