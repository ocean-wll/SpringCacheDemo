package pers.ocean.springcachedemo.service.impl;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import pers.ocean.springcachedemo.entity.UserEntity;
import pers.ocean.springcachedemo.service.UserService;

/**
 * @author : ocean_wll
 * @since 2021/7/17
 */
@Service
public class UserServiceImpl implements UserService {

    /**
     * 根据id查询用户信息，这里直接new一个新对象返回
     *
     * @param id 主键id
     * @return UserEntity
     */
    @Override
    @Cacheable("user")
    public UserEntity findById(Long id) {
        System.out.println("我开始new一个新对象了！！！");
        UserEntity userEntity = new UserEntity();
        userEntity.setId(id);
        userEntity.setName("ocean_wll");
        userEntity.setAge(26);
        return userEntity;
    }
}
