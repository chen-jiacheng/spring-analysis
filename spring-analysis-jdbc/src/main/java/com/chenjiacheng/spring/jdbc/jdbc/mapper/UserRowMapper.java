package com.chenjiacheng.spring.jdbc.jdbc.mapper;


import com.chenjiacheng.spring.jdbc.jdbc.entity.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by chenjiacheng on 2024/1/28 23:44
 *
 * @author chenjiacheng
 * @since 1.0.0
 */
public class UserRowMapper implements RowMapper {
    @Override
    public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new User(
                rs.getInt("id"),
                rs.getString("name"),
                rs.getInt("age"),
                rs.getString("sex")
        );
    }
}
