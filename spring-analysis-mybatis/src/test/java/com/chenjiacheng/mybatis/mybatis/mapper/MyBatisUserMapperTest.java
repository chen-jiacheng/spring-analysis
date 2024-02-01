package com.chenjiacheng.mybatis.mybatis.mapper;

import com.chenjiacheng.mybatis.mybatis.entity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;

/**
 * Created by chenjiacheng on 2024/1/30 00:20
 *
 * @author chenjiacheng
 * @since 1.0.0
 */
public class MyBatisUserMapperTest {

    private final static SqlSessionFactory sqlSessionFactory;
    static {
        String resource = "mybatis/mybatis-config.xml";
        Reader reader = null;
        try {
            reader = Resources.getResourceAsReader(resource);
        }catch (IOException e){
            System.out.println("e = " + e);
        }
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
    }
    @Test
    public void insertUser() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            User user = new User(null,"xxx",5,"男");
            userMapper.insertUser(user);
            sqlSession.commit();
        }finally {
            sqlSession.close();
        }
    }

    @Test
    public void getUser() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            User user = userMapper.getUser(2);
            System.out.println("user = " + user);
        }finally {
            sqlSession.close();
        }

    }
}