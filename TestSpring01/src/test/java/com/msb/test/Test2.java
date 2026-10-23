package com.msb.test;

import com.msb.pojo.Girl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 通过ref给对象注入一个对象
 */
public class Test2 {
    public static void main(String[] args) {
        // 创建spring容器
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println("自动注入完成------");
        // 获取对象：
        Girl girl = context.getBean("girl", Girl.class);

        System.out.println("打印 = " + girl);
    }
}
