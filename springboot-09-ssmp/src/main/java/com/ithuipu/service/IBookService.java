package com.ithuipu.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.ithuipu.pojo.Book;

/**
 * @className: IBookService
 * @author: Mr.BingYu
 * @description:
 * @date: 2022/12/08 18:54
 **/

/**
 * @author: Mr.BingYu
 * 使用mp的业务层接口进行快速开发
 */
public interface IBookService extends IService<Book> {

    /**
     * save Book
     */
    void saveBook(Book book);

    Page<Book> findByPage(Page page ,Book book);
}
