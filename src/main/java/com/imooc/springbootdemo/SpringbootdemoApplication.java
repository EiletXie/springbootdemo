package com.imooc.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class SpringbootdemoApplication {

    public static void main(String[] args) {

        new SpringApplicationBuilder(SpringBootApplication.class).run(args);
       // SpringApplication.run(SpringbootdemoApplication.class, args);
    }

}
