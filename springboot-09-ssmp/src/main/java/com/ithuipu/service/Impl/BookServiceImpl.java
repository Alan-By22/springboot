package com.ithuipu.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ithuipu.dao.BookDao;
import com.ithuipu.pojo.Book;
import com.ithuipu.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @className: BookServiceImpl
 * @author: Mr.BingYu
 * @description:
 * @date: 2022/12/08 19:01
 **/

@Service
public class BookServiceImpl extends ServiceImpl<BookDao, Book> implements IBookService {

    /**
     * 我们需要自定义一些方法--参考之前写法---增强
     */
    @Autowired
    BookDao bookDao;

    /**
     * 自定义的方法一定要注意避免修改提供的方法
     */
    @Override
    public void saveBook(Book book) {
        int insert = bookDao.insert(book);
    }



}
