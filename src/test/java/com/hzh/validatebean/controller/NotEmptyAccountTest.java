package com.hzh.validatebean.controller;


import com.hzh.validatebean.core.user.bo.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @ClassName NotEmptyAccountTest
 * @Description TODO
 * @Author DaHuangGo
 * @Date 2023/9/26 18:21
 * @Version 0.0.1
 **/
public class NotEmptyAccountTest {

    private Validator validator;

    @BeforeEach
    public void setUp() {
        validator = new LocalValidatorFactoryBean();
        ((LocalValidatorFactoryBean) validator).afterPropertiesSet();
    }

    @Test
    public void testNotEmptyAccount_withValidAccount() {
        User user = new User();
        user.setAccount("validAccount");

        Set<ConstraintViolation<User>> violations = validator.validate(user);
        assertTrue(violations.isEmpty());
    }

    @Test
    public void testNotEmptyAccount_withNullAccount() {
        User user = new User();
        user.setAccount(null);

        Set<ConstraintViolation<User>> violations = validator.validate(user);
        assertEquals(0, violations.size());
    }

    @Test
    public void testNotEmptyAccount_withEmptyAccount() {
        User user = new User();
        user.setAccount("");

        Set<ConstraintViolation<User>> violations = validator.validate(user);
        assertEquals(0, violations.size());
    }
}
