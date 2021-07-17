package pers.ocean.springcachedemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pers.ocean.springcachedemo.entity.UserEntity;
import pers.ocean.springcachedemo.service.UserService;

/**
 * @author : ocean_wll
 * @since 2021/7/17
 */
@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public UserEntity findById(@RequestParam Long id) {
        return userService.findById(id);
    }
}
