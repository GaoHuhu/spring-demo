package com.gj.service.impl;

import com.gj.service.IRedisClient;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import java.io.Serializable;

@Service
public class RedisClient implements IRedisClient {
    public void setRedisTemplate(RedisTemplate<Serializable, Object> redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    private RedisTemplate<Serializable,Object> redisTemplate;

    public boolean set(String key, Object value) {
        try {
            ValueOperations<Serializable, Object> valueOperations = redisTemplate.opsForValue();
            valueOperations.set(key, value);
            return true;
        }
        catch (Exception e){
            System.out.println(e);
            throw new RuntimeException(e);
        }
    }

    public Object get(String key) {
        ValueOperations<Serializable,Object> valueOperations=redisTemplate.opsForValue();
        return valueOperations.get(key);
    }
}
