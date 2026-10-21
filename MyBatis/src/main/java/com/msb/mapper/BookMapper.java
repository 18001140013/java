package com.msb.mapper;

import com.msb.pojo.Book;

import java.util.List;

public interface BookMapper {

    int NUMBER = 10;

    List selectAllBooks();

    List selectOneBookById(int id);

    // 查询到数据是多个时会报错，所以底层代码实现肯定是多个返回的是一个list
    Book selectOneBookByObject(Book book);

    //    增加一个book
    int addOneBook(Book book);

//    删除id=null的数据
    int deleteAllIdNullBook();
//    修改表数据
    int updateNameById(String newName,int byID);
}
