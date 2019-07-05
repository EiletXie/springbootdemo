package com.imooc.springbootdemo.annotation;

import org.springframework.stereotype.Repository;

import java.lang.annotation.*;

/**
 *
 * 二级 {@link Repository @FirstLevelRepository}
 *
 * @Auther: CXIE
 * @Date: 2019/7/5 20:46
 * @Description:
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@FirstLevelRepository
public @interface SecondLevelRepository {
    String value() default  "";
}
