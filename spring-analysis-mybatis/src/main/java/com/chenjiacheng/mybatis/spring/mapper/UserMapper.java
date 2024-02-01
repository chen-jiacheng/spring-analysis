package com.chenjiacheng.mybatis.spring.mapper;

import com.chenjiacheng.mybatis.spring.entity.User;

/**
 * Created by chenjiacheng on 2024/1/30 00:02
 *
 * @author chenjiacheng
 * @since 1.0.0
 */
public interface UserMapper {

    void insertUser(User user);
    User getUser(Integer id);

}
