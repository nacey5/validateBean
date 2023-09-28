package com.hzh.validatebean.core.user.controller;

import com.hzh.validatebean.core.user.bo.User;
import com.hzh.validatebean.core.user.convert.UserConvert;
import com.hzh.validatebean.core.user.mock.MockService;
import com.hzh.validatebean.core.user.validate.NotEmptyAccount;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName HelloController
 * @Description TODO
 * @Author DaHuangGo
 * @Date 2023/9/26 17:30
 * @Version 0.0.1
 **/

@RestController
public class HelloController {


    @Resource
    private MockService mockService;


    @GetMapping("/hello")
    public void processHello() {
        System.out.println("program run successful");
    }

    @PostMapping("/mockAdd")
    public Boolean processMockAdd(@NotEmptyAccount User user) {
        return mockService.add(UserConvert.boToDto(user));
    }
}
