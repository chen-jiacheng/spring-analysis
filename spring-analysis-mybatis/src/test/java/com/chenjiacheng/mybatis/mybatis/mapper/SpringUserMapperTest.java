package com.chenjiacheng.mybatis.mybatis.mapper;


import com.chenjiacheng.mybatis.spring.entity.User;
import com.chenjiacheng.mybatis.spring.mapper.UserMapper;
import org.apache.ibatis.session.defaults.DefaultSqlSessionFactory;
import org.junit.Test;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;


/**
 * Created by chenjiacheng on 2024/1/30 00:20
 *
 * @author chenjiacheng
 * @since 1.0.0
 */
public class SpringUserMapperTest {

    @Test
    public void getUser(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/spring-mybatis.xml");

        DataSource dataSource = ctx.getBean("dataSource", DataSource.class);
        System.out.println("dataSource = " + dataSource);


        DefaultSqlSessionFactory sqlSessionFactory = ctx.getBean("sqlSessionFactory", DefaultSqlSessionFactory.class);
        System.out.println("sqlSessionFactory = " + sqlSessionFactory);

        UserMapper userMapper = ctx.getBean("userMapper", UserMapper.class);
        User user = userMapper.getUser(1);
        System.out.println("user = " + user);


    }

}