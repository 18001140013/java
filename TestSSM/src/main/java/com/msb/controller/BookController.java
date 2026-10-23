package com.msb.controller;

import com.msb.pojo.Book;
import com.msb.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 控制层
 */
@Controller
public class BookController {
    @Autowired
    private BookService bookService;

    @RequestMapping("/findAllBooks")
    @ResponseBody
    public String findAllBooks() {
        System.out.println("进来了=======");
        List bookList = bookService.findAll();
        String bookPrint = "";
        for (int i = 0; i < bookList.size(); i++) {
            Book item = (Book) bookList.get(i);
            bookPrint = bookPrint + i + ":" + item.getName() + "\n";
        }
        System.out.println("一共有书籍:" + bookList.size());
        return bookPrint;
    }
}
