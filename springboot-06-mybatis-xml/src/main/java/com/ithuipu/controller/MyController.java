package com.ithuipu.controller;

import com.ithuipu.dao.UserMapper;
import com.ithuipu.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @className: MyController
 * @author: Mr.BingYu
 * @description:
 * @date: 2022/12/06 19:22
 **/

@RestController
@RequestMapping("/user")
public class MyController {
    /**注入dao*/
    @Autowired
    private UserMapper userMapper;

    /**
     * 1.查询
     */
    @RequestMapping("/findAll")
    public List<User> findAll() {
        return  userMapper.findAll();
    }


    /**
     * 2.添加
     */
    @RequestMapping("/save")
    public String findAll(User user) {
        try {
            userMapper.save(user);
            return "true";
        }catch (Exception e){
            e.printStackTrace();
            return "false";
        }
    }
}
