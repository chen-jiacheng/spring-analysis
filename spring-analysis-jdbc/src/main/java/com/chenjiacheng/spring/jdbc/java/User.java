package com.chenjiacheng.spring.jdbc.java;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * Created by chenjiacheng on 2024/1/28 22:30
 *
 * @author chenjiacheng
 * @since 1.0.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private Long id;
    private String username;
    private String password;
    private String address;
    private String phoneNumber;
    private String emailAddress;
    private Integer userStatus;
    private LocalDateTime createAt;
    private LocalDateTime updateAt;


}
