package com.github.peach.cache;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LocalCacheTest {

    LocalCache<String,String> localCache = new LocalCache<>();

    @Test
    void get() {
        localCache.put("1","a");
        Assertions.assertNotNull(localCache.get("1"));
    }

    @Test
    void put() {
        localCache.put("1","a");
        localCache.put("2","b");
        localCache.put("3","c");
        Assertions.assertNotNull(localCache.get("1"));
        Assertions.assertNotNull(localCache.get("2"));
        Assertions.assertNotNull(localCache.get("3"));
    }

    @Test
    void invalidate() {
        localCache.put("1","a");
        localCache.put("2","b");
        localCache.put("3","c");
        localCache.invalidate("1");
        Assertions.assertNull(localCache.get("1"));
    }

    @Test
    void size() {
        Assertions.assertEquals(localCache.size(),0);
        localCache.put("1","A");
        Assertions.assertEquals(localCache.size(),1);
    }
}