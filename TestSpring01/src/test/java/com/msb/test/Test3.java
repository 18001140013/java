package com.msb.test;


import com.msb.pojo.A;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 注解注入
 * Autowired 不会使用set方法
 * Value 不会使用set方法
 */
public class Test3 {
    public static void main(String[] args) {
        // 创建spring容器
        ApplicationContext context = new ClassPathXmlApplicationContext("services.xml");
        System.out.println("自动注入完成------");
        // 获取对象：对象默认名字是是类名首字母小写
        A a = context.getBean("a", A.class);

        System.out.println("打印 = " + a);
    }
}
