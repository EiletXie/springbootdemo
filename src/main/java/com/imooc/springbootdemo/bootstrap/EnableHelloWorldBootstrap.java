package com.imooc.springbootdemo.bootstrap;

import com.imooc.springbootdemo.annotation.EnableHelloWorld;
import com.imooc.springbootdemo.repository.MyFirstLevelRepository;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 *
 * {@link EnableHelloWorld}  引导类
 *
 * @Auther: CXIE
 * @Date: 2019/7/5 21:43
 * @Description:
 */
@EnableHelloWorld
public class EnableHelloWorldBootstrap {


    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(EnableHelloWorldBootstrap.class)
                .web(WebApplicationType.NONE)
                .run(args);

        // myFirstLevelRepository Bean 是否存在
        String helloWorld =
                context.getBean("helloWorld",String.class);

        System.out.println("helloWorld Bean :" +helloWorld);

        // 关闭上下文
        context.close();
    }
}
