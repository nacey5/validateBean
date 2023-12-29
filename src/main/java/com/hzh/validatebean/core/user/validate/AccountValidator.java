package com.hzh.validatebean.core.user.validate;

import com.hzh.validatebean.core.user.dto.User;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @ClassName AccountValidator
 * @Description TODO
 * @Author DaHuangGo
 * @Date 2023/9/26 17:52
 * @Version 0.0.1
 **/
public class AccountValidator implements ConstraintValidator<NotEmptyAccount, User> {
    @Override
    public void initialize(NotEmptyAccount constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(User value, ConstraintValidatorContext context) {
        return value != null && ! ( null== value.getAccount() || "".equals(value.getAccount()));
    }
}
