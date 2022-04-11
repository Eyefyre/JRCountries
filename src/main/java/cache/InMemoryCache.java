/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cache;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.DelayQueue;
import model.Country;

/**
 *
 * @author Adam
 */
public class InMemoryCache implements Cache {

    private final ConcurrentHashMap<String, ArrayList<Country>> cache = new ConcurrentHashMap<>();
    private final DelayQueue<CacheObject> cleaningUpQueue = new DelayQueue<>();

    public InMemoryCache() {
        Thread cleanerThread = new Thread(() -> {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    CacheObject delayedCacheObject = cleaningUpQueue.take();
                    cache.remove(delayedCacheObject.getKey(), delayedCacheObject.getReference());
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });
        cleanerThread.setDaemon(true);
        cleanerThread.start();
    }

    public void add(String key, ArrayList<Country> value, long periodInMillis) {
        if (key == null) {
            return;
        }
        if (value == null) {
            cache.remove(key);
        } else {
            long expiryTime = System.currentTimeMillis() + periodInMillis;
            ArrayList<Country> reference = value;
            cache.put(key, reference);
            cleaningUpQueue.put(new CacheObject(key, reference, expiryTime));
        }
    }

    public void remove(String key) {
        cache.remove(key);
    }

    public ArrayList<Country> get(String key) {
        return cache.get(key);
    }

    public void clear() {
        cache.clear();
    }

    public long size() {
        return cache.size();
    }
    
    public boolean contains(String key) {
        return (cache.get(key) != null);
    }

}
