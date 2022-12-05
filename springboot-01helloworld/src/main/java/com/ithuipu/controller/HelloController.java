package com.ithuipu.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @className: HelloController
 * @author: Mr.BingYu
 * @description: TODO 类描述
 * @date: 2022/12/05 14:13
 **/

@RestController
public class HelloController {

    /**
     * 1.向前台响应json串
     */
    @RequestMapping("/")
    public String sayHello() {
        return "Hello,SpringBoot";
    }
}
