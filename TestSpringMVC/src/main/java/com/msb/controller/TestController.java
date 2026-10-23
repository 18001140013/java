package com.msb.controller;

import com.msb.pojo.P;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 与前端交互层-控制器
 */
@Controller
public class TestController {
    @RequestMapping("/test1")
    public String test1() {
        System.out.println("请求参数来了");
        return "index.jsp";
    }

    @RequestMapping("/testParam")
    public String testParam(String name, int age) {
        System.out.println("请求参数来了--普通参数" + name + "------" + age);
        return "index.jsp";
    }

    @RequestMapping("/testParam2")
    public String testParam2(P p) {
        System.out.println("请求参数来了2--普通参数" + p);
        return "index.jsp";
    }
}
