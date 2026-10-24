package com.msb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // 这个注解表明是一个启动类
@MapperScan("com.msb.mapper") // 扫描mapper
public class TestSpringBootApplication {
    public static void main(String[] args) {
        // 会扫描 run指定的TestSpringBootApplication.class，路径的同包与子包下的所有类都会被扫描上，实现注入。
        // 扫描了com.msb目录下
        SpringApplication.run(TestSpringBootApplication.class,args);
    }
}
