package com.chenjiacheng.spring.jdbc.jdbc;

import com.chenjiacheng.spring.jdbc.jdbc.entity.User;
import com.chenjiacheng.spring.jdbc.jdbc.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by chenjiacheng on 2024/1/29 00:22
 *
 * @author chenjiacheng
 * @since 1.0.0
 */
public class SpringJdbcTest {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-jdbc.xml");
        UserService userService = (UserService) ctx.getBean("userService");
        User user = new User();
        user.setName("张三");
        user.setAge(20);
        user.setSex("男");
        userService.save(user);

        List<User> users = userService.getUsers();
        for (User u : users) {
            System.out.println("u = " + u);
        }

    }

}
