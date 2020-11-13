package com.github.peach.cache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

/**
 * Redis缓存
 *
 * @author peach
 * @since 2020/11/12 14:05
 */
@Component
public class RedisCache<K, V> implements Cache<K, V> {

    private final RedisTemplate<K, V> redisTemplate;

    public RedisCache(RedisTemplate<K, V> redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    @Override
    public V get(K k) {
        return redisTemplate.boundValueOps(k).get();
    }

    @Override
    public void put(K k, V v) {
        redisTemplate.boundValueOps(k).set(v);
    }

    @Override
    public void invalidate(K k) {
        redisTemplate.delete(k);
    }

}