package com.gj.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class RedisClientTest {
    @Autowired
    private IRedisClient redisClient;

    @Test
    public void testGet(){
        System.out.println(redisClient.get("hhh"));
    }

    @Test
    public void testSet(){
        redisClient.set("hhh","今天是个好天气");
    }
}
