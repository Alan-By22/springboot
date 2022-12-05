package com.ithuipu.controller;

import com.ithuipu.pojo.User;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @className: UserController
 * @author: Mr.BingYu
 * @description:
 * @date: 2022/12/05 15:53
 **/


@RestController
public class UserController {

    @RequestMapping("/")
    public User getUser(){
        return new User("王五",19);
    }
}
