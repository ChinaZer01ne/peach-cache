package com.github.peach.cache;

/**
 * @author peach
 * @since 2020/11/13 10:16
 */
public class CacheBuilder<K, V> {

    /**
     * 构造缓存对象
     * @return com.github.peach.cache.Cache<K,V>
     */
    public Cache<K, V> build() {
        return new LocalCache<>();
    }

    /**
     * 创建构造器
     * @return com.github.peach.cache.CacheBuilder<java.lang.Object,java.lang.Object>
     */
    public static CacheBuilder<Object, Object> newBuilder() {
        return new CacheBuilder<>();
    }

}