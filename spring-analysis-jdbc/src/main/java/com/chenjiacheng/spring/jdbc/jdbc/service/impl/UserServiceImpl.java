package com.chenjiacheng.spring.jdbc.jdbc.service.impl;

import com.chenjiacheng.spring.jdbc.jdbc.entity.User;
import com.chenjiacheng.spring.jdbc.jdbc.mapper.UserRowMapper;
import com.chenjiacheng.spring.jdbc.jdbc.service.UserService;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created by chenjiacheng on 2024/1/28 23:53
 *
 * @author chenjiacheng
 * @since 1.0.0
 */
public class UserServiceImpl implements UserService {

    private JdbcTemplate jdbcTemplate;

    public void setDataSource(DataSource dataSource){
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public void save(User user) {
        String sql = "insert into user(name,age,sex)values ( ?,?,? )";
        Object[] objects = new Object[]{
                user.getName(),
                user.getAge(),
                user.getSex()
        };
        jdbcTemplate.update(sql,objects);
    }

    @Override
    public List<User> getUsers() {
        String sql = "select * from user";
        return jdbcTemplate.query(sql,new UserRowMapper());
    }
}
