package com.imooc.springbootdemo.annotation;

import com.imooc.springbootdemo.configuration.HelloWorldConfiguration;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Repository;

import java.lang.annotation.*;

/**
 *
 * 激活注解配置
 *
 * @Auther: CXIE
 * @Date: 2019/7/5 20:46
 * @Description:
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
//@Import(HelloWorldConfiguration.class)
@Import(HelloWorldImportSelector.class)
public @interface EnableHelloWorld {
}
