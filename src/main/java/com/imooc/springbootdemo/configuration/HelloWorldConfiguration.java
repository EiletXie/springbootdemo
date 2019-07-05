package com.imooc.springbootdemo.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: CXIE
 * @Date: 2019/7/5 21:39
 * @Description:
 */
@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String helloWorld(){
        // 方法名就是bean的名称，如果是类作为bean的话，类名首字母小写为Bean的名称
        return "Hello World";
    }
}
