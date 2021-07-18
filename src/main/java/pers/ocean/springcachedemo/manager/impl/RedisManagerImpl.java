package pers.ocean.springcachedemo.manager.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;
import pers.ocean.springcachedemo.manager.RedisManager;

import java.util.concurrent.TimeUnit;

/**
 * @author : ocean_wll
 * @since 2021/7/18
 */
@Component
public class RedisManagerImpl implements RedisManager {

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    @Override
    public Boolean setnxAndExpire(String key, String value, Long seconds) {
        return redisTemplate.opsForValue().setIfAbsent(key, value, seconds, TimeUnit.SECONDS);
    }

    @Override
    public Long descIncr(String key) {
        return redisTemplate.opsForValue().increment(key, -1);
    }
}
