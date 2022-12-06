package com.ithuipu.controller;

import com.ithuipu.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * @className: MyController
 * @author: Mr.BingYu
 * @description:
 * @date: 2022/12/06 16:08
 **/

@Controller
public class MyController {

    @ResponseBody
    @RequestMapping("/hello.html")
    public String sayHello() {
        return "SpringBoot......";
    }

    @ResponseBody
    @RequestMapping("/index.html")
    public String sayIndex() {
        return "SpringBoot......index";
    }

    @RequestMapping("/freemarker")
    public String freemarker(Model model) {
        //1.接收请求
        //2.调用service
        //3.将数据填充到页面
        model.addAttribute("msg", "springboot--freemarker");
        //转发到该页面: 位置 + 名字 + 后缀
        return "hello";
    }


    @RequestMapping("/thymeleaf")
    public String thymeleaf(Model model) {
        //1.接收请求
        //2.调用service
        List<User> list = new ArrayList<>();
        list.add(new User("韩雪",29,"北京"));
        list.add(new User("憨憨",22,"上海"));
        list.add(new User("李明",24,"苏州"));
        //3.将数据填充到页面
        model.addAttribute("users",list);
        //转发到该页面: 前缀 + 名字 + 后缀
        return "hello2";
    }
}
