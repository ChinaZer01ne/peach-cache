package com.github.peach.cache;

import java.util.concurrent.ConcurrentHashMap;

/**
 * 本地缓存
 *
 * @author peach
 * @since 2020/11/12 14:05
 */
public class LocalCache<K, V> implements Cache<K, V> {

    /**
     * 缓存池
     */
    private final ConcurrentHashMap<K, V> cache = new ConcurrentHashMap<>(256);

    @Override
    public V get(K k) {
        return cache.get(k);
    }

    @Override
    public void put(K k, V v) {
        cache.put(k,v);
    }

    @Override
    public void invalidate(K k) {
        cache.remove(k);
    }

    /**
     * 返回缓存大小
     *
     * @return long
     */
    long size(){
        return cache.size();
    }

}