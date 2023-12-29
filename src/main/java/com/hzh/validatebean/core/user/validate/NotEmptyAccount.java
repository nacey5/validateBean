package com.hzh.validatebean.core.user.validate;


import javax.validation.Constraint;
import javax.validation.Payload;
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
    String message() default "Account cannot be empty or null"; // 添加 message 属性
    Class<?>[] groups() default {}; // 添加 groups 属性，即使是空的

    Class<? extends Payload>[] payload() default {}; // 添加 payload 属性，即使是空的

}
