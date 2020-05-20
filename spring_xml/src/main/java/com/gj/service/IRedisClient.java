package com.gj.service;

public interface IRedisClient {
    boolean set(String key,Object vlaue);
    Object get(String key);
}
