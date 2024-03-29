package com.imooc.springbootdemo.annotation;

import com.imooc.springbootdemo.configuration.HelloWorldConfiguration;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * HelloWorld {@link ImportSelector} 实现
 *
 * @Auther: CXIE
 * @Date: 2019/7/5 21:57
 * @Description:
 */
public class HelloWorldImportSelector implements  ImportSelector{

    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        return new String[]{HelloWorldConfiguration.class.getName()};
    }
}
