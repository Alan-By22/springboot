package com.ithuipu.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ithuipu.pojo.Book;
import com.ithuipu.service.IBookService;
import com.ithuipu.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @className: Book
 * @author: Mr.BingYu
 * @description:
 * @date: 2022/12/10 13:09
 **/

@RestController
@RequestMapping("/books")
public class BookController {
    /**
     * 使用restful风格
     * 查询(get)保存(post)更新(put)删除(delete)
     */

    /**
     * 注入业务层
     */
    @Autowired
    private IBookService iBookService;


    /**
     * 1.查询
     */
    @GetMapping
    public Result getAll() {
        List<Book> list = iBookService.list();
        return new Result(true, list);
    }

    /**
     * 2.分页查询
     */
    @GetMapping("/{currentPage}/{pageSize}")
    public Result getPage(@PathVariable Integer currentPage, @PathVariable Integer pageSize, Book book) {
        //Page<Book> page = iBookService.page(new Page<Book>(currentPage, pageSize));
        Page<Book> page = iBookService.findByPage(new Page<Book>(currentPage, pageSize), book);
        //解决删除最后一页的最后一条消息的bug(会停留在删除页,但是无信息),解决后会跳转前一页
        if (currentPage > page.getPages()) {
            page = iBookService.findByPage(new Page<Book>(page.getPages(), pageSize), book);
        }
        return new Result(true, page);
    }

    /**
     * 3.根据id查询
     */
    @GetMapping("{id}")
    public Result getById(@PathVariable Integer id) {
        Book book = iBookService.getById(id);
        return new Result(true, book);
    }

    /**
     * 4.添加--发送json
     */
    @PostMapping
    public Result save(@RequestBody Book book) {
        boolean flag = iBookService.save(book);
        return new Result(flag, flag ? "添加成功!!" : "添加失败!!");
    }


    /**
     * 5.修改
     */
    @PutMapping
    public Result update(@RequestBody Book book) {
        boolean flag = iBookService.updateById(book);
        return new Result(flag, flag ? "修改成功!!" : "修改失败!!");
    }


    /**
     * 6.删除
     */
    @DeleteMapping("{id}")
    public Result delete(@PathVariable Integer id) {
        boolean flag = iBookService.removeById(id);
        return new Result(flag, flag ? "删除成功!!" : "删除失败!!");
    }
}
