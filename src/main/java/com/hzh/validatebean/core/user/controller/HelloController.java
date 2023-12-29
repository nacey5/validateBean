package com.hzh.validatebean.core.user.controller;

import com.hzh.validatebean.core.user.dto.User;
import com.hzh.validatebean.core.user.convert.UserConvert;
import com.hzh.validatebean.core.user.mock.MockService;
import com.hzh.validatebean.core.user.validate.NotEmptyAccount;
import com.hzh.validatebean.core.user.validate.Properties;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;

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


    @PostMapping("/true")
    public Boolean processProperties(@Valid @RequestBody Properties properties) {
        System.out.println("true");
        System.out.println(properties.getUser());
        return true;
    }
}
