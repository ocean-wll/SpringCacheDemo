package pers.ocean.springcachedemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : ocean_wll
 * @since 2021/7/18
 */
@RestController
@RequestMapping("/api/redis")
public class RedisPubController {

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    /**
     * redis生产者测试
     *
     * @param data
     * @return
     */
    @GetMapping("/send1")
    String send1(String data) {
        redisTemplate.convertAndSend("ocean_wll", data);
        return "success";
    }

    /**
     * redis生产者测试
     *
     * @param data
     * @return
     */
    @GetMapping("/send2")
    String send2(String data) {
        redisTemplate.convertAndSend("ocean", data);
        return "success";
    }
}
