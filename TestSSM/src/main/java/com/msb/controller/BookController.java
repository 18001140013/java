package com.msb.controller;

import com.msb.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 控制层
 */
@Controller
public class BookController {
    @Autowired
    private BookService bookService;

    @RequestMapping("/findAllBooks")
    public String findAllBooks() {
        List bookList = bookService.findAll();
        System.out.println("一共有书籍:" + bookList.size());
        return "index.jsp";
    }
}
