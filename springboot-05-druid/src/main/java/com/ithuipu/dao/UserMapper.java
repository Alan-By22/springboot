package com.ithuipu.dao;

import com.ithuipu.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @className: UserMapper
 * @author: Mr.BingYu
 * @description:
 * @date: 2022/12/06 19:18
 **/

@Mapper  //获得mapper代理对象
public interface UserMapper {

    /**
     * 1.查询
     */
    @Select("select * from t_user")
    List<User> findAll();

    /**2.添加*/
    @Insert("insert into t_user values(null,#{name},#{age})")
    void save(User user);
}
