package pers.ocean.springcachedemo.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author : ocean_wll
 * @since 2021/7/17
 */
@Data
public class UserEntity implements Serializable {

    private static final long serialVersionUID = 1424027170891668221L;

    /**
     * 主键
     */
    private Long id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 年龄
     */
    private Integer age;
}
