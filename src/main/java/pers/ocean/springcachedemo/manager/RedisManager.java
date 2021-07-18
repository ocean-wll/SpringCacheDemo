package pers.ocean.springcachedemo.manager;

/**
 * @author : ocean_wll
 * @since 2021/7/18
 */
public interface RedisManager {

    /**
     * 分布式锁实现
     * setnx指令与expire指令同时执行确保原子性
     *
     * @param key     key值
     * @param value   value值
     * @param seconds 过期时间，单位秒
     * @return true抢到锁了，false没有抢到锁
     */
    Boolean setnxAndExpire(String key, String value, Long seconds);

    /**
     * 自减1
     *
     * @param key redis中的key
     * @return 自减1以后的值
     */
    Long descIncr(String key);
}
