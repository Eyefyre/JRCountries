/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cache;

import com.google.common.primitives.Longs;
import java.util.ArrayList;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;
import model.Country;

/**
 *
 * @author Adam
 */
public class CacheObject implements Delayed {

    private final String key;
    private final ArrayList<Country> reference;
    private final long expiryTime;

    public CacheObject(String key, ArrayList<Country> reference, long expiryTime) {
        this.key = key;
        this.reference = reference;
        this.expiryTime = expiryTime;
    }

    public String getKey() {
        return key;
    }

    public ArrayList<Country> getReference() {
        return reference;
    }

    public long getExpiryTime() {
        return expiryTime;
    }

    @Override
    public long getDelay(TimeUnit unit) {
        return unit.convert(expiryTime - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
    }

    @Override
    public int compareTo(Delayed o) {
        return Longs.compare(expiryTime, ((CacheObject) o).expiryTime);
    }
}
