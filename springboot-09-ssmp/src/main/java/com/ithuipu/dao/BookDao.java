package com.ithuipu.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ithuipu.pojo.Book;
import org.apache.ibatis.annotations.Mapper;

/**
 * @className: BookDao
 * @author: Mr.BingYu
 * @description:
 * @date: 2022/12/08 18:45
 **/

@Mapper
public interface BookDao extends BaseMapper<Book> {
}
