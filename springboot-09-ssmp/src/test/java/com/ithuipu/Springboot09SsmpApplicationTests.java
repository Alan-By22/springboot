package com.ithuipu;

import com.ithuipu.dao.BookDao;
import com.ithuipu.pojo.Book;
import com.ithuipu.service.IBookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot09SsmpApplicationTests {

    @Autowired
    IBookService iBookService;

    @Test
    void contextLoads1() {
        Book book = new Book();
        book.setName("java的学习");
        book.setDescription("基础信息");
        book.setType("编程");
        //1.自定义的方法
        iBookService.saveBook(book);
    }

    @Test
    void contextLoads2() {
        Book book = new Book();
        book.setName("java框架");
        book.setDescription("框架信息");
        book.setType("编程");
        boolean save = iBookService.save(book);
    }

}
