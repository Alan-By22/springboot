package com.ithuipu.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ithuipu.pojo.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @className: UserDao
 * @author: Mr.BingYu
 * @description:
 * @date: 2022/12/07 13:28
 **/

@Mapper
public interface UserDao extends BaseMapper<User> {
    //内置crud的方法
}
