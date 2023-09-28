package com.hzh.validatebean.core.user.validate;


import javax.validation.Constraint;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/**
 * @ClassName NotEmptyAccount
 * @Description TODO
 * @Author DaHuangGo
 * @Date 2023/9/26 17:38
 * @Version 0.0.1
 **/

@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = AccountValidator.class)
public @interface NotEmptyAccount {
}
