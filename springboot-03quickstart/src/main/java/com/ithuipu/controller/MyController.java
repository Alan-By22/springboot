package com.ithuipu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @className: MyController
 * @author: Mr.BingYu
 * @description:
 * @date: 2022/12/05 17:13
 **/

@RestController
public class MyController {

    @RequestMapping("/")
    public String sayHello() {
        return "Hello,SpringBoot----";
    }

    /**
     *     //springboot--默认的配置文件application.properties或application.yml（application.yaml）
     *     application.properties --键值对
     *     application.yml --yml的语法--学习语法
     *     配置文件的作用?  修改默认的配置
     *     配置文件里边该怎么写? --参考官方文档 , 根据修改的组件
     *     如何进行匹配绑定的? 大量的自动配置类XXXAutoConfiguration--加载XXXProperties--配置文件修改的默认的配置--修改的是XXXProperties中的属性
     *     如何绑定: 2中方案
     *     方案一: @Component + @ConfigurationProperties (注意:只有在容器中的组件才会生效)
     *     方案二: @EnableConfigurationProperties (需要定义在配置类上)+ @ConfigurationProperties (springboot进行属性绑定的方案)
     * */
}
