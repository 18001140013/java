package com.msb.test;

import com.msb.pojo.Book;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * spring 业务层
 * 1、spring容器创建，ioc/di代码实现
 */
public class Test {
    public static void main(String[] args) {
        // 创建spring容器-会在运行时创建对象
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println("自动注入完成------");
        // 获取对象：
        Book book = context.getBean("bBook", Book.class);
        Book book2 = context.getBean("bBook2", Book.class);

        System.out.println("book = " + book);
        System.out.println("book = " + book2);
    }
}
