package com.chenjiacheng.spring.jdbc.jdbc.service;

import com.chenjiacheng.spring.jdbc.jdbc.entity.User;

import java.util.List;

/**
 * Created by chenjiacheng on 2024/1/28 23:52
 *
 * @author chenjiacheng
 * @since 1.0.0
 */
public interface UserService {

    void save(User user);

    List<User> getUsers();

}
