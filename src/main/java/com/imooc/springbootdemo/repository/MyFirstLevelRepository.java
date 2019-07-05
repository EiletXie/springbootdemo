package com.imooc.springbootdemo.repository;

import com.imooc.springbootdemo.annotation.FirstLevelRepository;
import org.springframework.stereotype.Component;

/**
 *
 * 我的 {@link FirstLevelRepository}
 * @Auther: CXIE
 * @Date: 2019/7/5 20:51
 * @Description:
 */
@FirstLevelRepository(value = "myFirstLevelRepository") // Bean名称
//@Component(value = "myFirstLevelRepository")
public class MyFirstLevelRepository {

}
