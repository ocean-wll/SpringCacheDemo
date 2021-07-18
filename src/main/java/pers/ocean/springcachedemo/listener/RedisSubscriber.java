package pers.ocean.springcachedemo.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.listener.adapter.MessageListenerAdapter;
import org.springframework.stereotype.Component;

/**
 * @author : ocean_wll
 * @since 2021/7/18
 */
@Component
public class RedisSubscriber extends MessageListenerAdapter {

    @Override
    public void onMessage(Message message, byte[] bytes) {
        System.out.println(message);
    }

}
