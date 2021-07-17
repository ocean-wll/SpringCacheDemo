package pers.ocean.springcachedemo.service;

import pers.ocean.springcachedemo.entity.UserEntity;

/**
 * @author : ocean_wll
 * @since 2021/7/17
 */
public interface UserService {

    /**
     * 根据id查询对应的用户信息
     *
     * @param id 主键id
     * @return UserEntity对象
     */
    UserEntity findById(Long id);
}
