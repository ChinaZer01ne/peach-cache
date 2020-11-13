package com.github.peach.cache;

/**
 * 缓存统一接口
 *
 * @author peach
 * @since 2020/11/12 14:05
 */
public interface Cache<K, V> {
    /**
     * 获取缓存值
     *
     * @param k : 缓存key
     * @return V 缓存值
     */
    V get(K k);

    /**
     * 缓存值
     *
     * @param k : 缓存key
     * @param v : 缓存值
     */
    void put(K k, V v);

    /**
     * 使缓存key失效
     *
     * @param k : 缓存key
     */
    void invalidate(K k);

}