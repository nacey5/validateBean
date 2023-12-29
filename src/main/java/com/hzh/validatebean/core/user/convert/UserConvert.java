package com.hzh.validatebean.core.user.convert;

import com.hzh.validatebean.core.user.dto.User;

/**
 * @ClassName UserConvert
 * @Description TODO
 * @Author DaHuangGo
 * @Date 2023/9/26 18:09
 * @Version 0.0.1
 **/
public class UserConvert {

    public static User boToDto(com.hzh.validatebean.core.user.dto.User user) {
        User ret = new User();
        ret.setRole("default");
        ret.setUserName(user.getUserName());
        ret.setMail(user.getMail());
        ret.setAccount(user.getAccount());
        return ret;
    }
}
