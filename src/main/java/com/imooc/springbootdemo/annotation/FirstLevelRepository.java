package com.imooc.springbootdemo.annotation;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.lang.annotation.*;

/**
 *
 * 一级 {@link Repository @Repository}
 *
 * @Auther: CXIE
 * @Date: 2019/7/5 20:46
 * @Description:
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Repository
public @interface FirstLevelRepository {

    String value() default  "";
}
