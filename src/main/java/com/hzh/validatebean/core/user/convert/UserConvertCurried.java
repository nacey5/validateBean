package com.hzh.validatebean.core.user.convert;

/**
 * @ClassName UserConvertCurried
 * @Description TODO
 * @Author DaHuangGo
 * @Date 2023/9/26 18:24
 * @Version 0.0.1
 **/
import com.hzh.validatebean.core.user.dto.User;

import java.util.function.Function;

public class UserConvertCurried {

    public static Function<com.hzh.validatebean.core.user.bo.User, User> boToDtoCurried() {
        return setRole("default")
                .andThen(setUserName())
                .andThen(setMail())
                .andThen(setAccount());
    }

    private static Function<com.hzh.validatebean.core.user.bo.User, User> setRole(String role) {
        return bo -> {
            User dto = new User();
            dto.setRole(role);
            return dto;
        };
    }


    private static Function<User, User> setUserName() {
        return dto -> {
            dto.setUserName(dto.getUserName());
            return dto;
        };
    }

    private static Function<User, User> setMail() {
        return dto -> {
            dto.setMail(dto.getMail());
            return dto;
        };
    }

    private static Function<User, User> setAccount() {
        return dto -> {
            dto.setAccount(dto.getAccount());
            return dto;
        };
    }
}
