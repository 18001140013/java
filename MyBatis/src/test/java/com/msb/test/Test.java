package com.msb.test;

import com.msb.mapper.BookMapper;
import com.msb.pojo.Book;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Test {
    // 启动入口
    public static void main(String[] args) throws IOException {
        // 指定核心配置文件：
        String resource = "config.xml";
        // 加载配置文件输入流：
        InputStream inputStream = Resources.getResourceAsStream(resource);
        // 通过配置文件创建工厂类：
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        // 通过工厂类创建一个session会话：
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 通过接口绑定方式实现sql查询 ：内部使用了动态代理模式，底层在编译过程中帮我们创建了实现类
        BookMapper bookMapper = sqlSession.getMapper(BookMapper.class);

        //        插入:需要session.commit()
//        Book inserBook = new Book(5,"活着","余华",99);
//        int resultCode = bookMapper.addOneBook(inserBook);
//        System.out.println("增加书籍： " + resultCode);
//        sqlSession.commit();

//        删除：
//        int resultDeleteCode = bookMapper.deleteAllIdNullBook();
//        System.out.println("删除id = null书籍： " + resultDeleteCode);
//        sqlSession.commit();

//        修改：
        int resultUpdateCode = bookMapper.updateNameById("wjh", 5);
        sqlSession.commit();
        System.out.println("更新name书籍 返回结果： " + resultUpdateCode);

//        查询
        List<Book> list = bookMapper.selectAllBooks();
        //        List<Book> list = bookMapper.selectOneBookById(4);
        // 遍历数据
        for (int i = 0; i <= list.size() - 1; i++) {
            Book book = list.get(i);
            System.out.println("查询到书籍： " + book);
        }

//        通过一个对象去查找数据
//        Book selectBook = new Book();
//        selectBook.setId(1);
//        selectBook.setName("java");
//        Book resultBook = bookMapper.selectOneBookByObject(selectBook);
//        System.out.println("通过对象条件 查询到书籍： " + resultBook);

        // 关闭资源
        sqlSession.close();
    }
}
