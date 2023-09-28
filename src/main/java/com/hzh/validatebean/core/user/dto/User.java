package com.hzh.validatebean.core.user.dto;

import lombok.Data;

/**
 * @ClassName User
 * @Description TODO
 * @Author DaHuangGo
 * @Date 2023/9/26 18:07
 * @Version 0.0.1
 **/
@Data
public class User {
    private String account;
    private String userName;
    private String mail;
    private String role;
}
