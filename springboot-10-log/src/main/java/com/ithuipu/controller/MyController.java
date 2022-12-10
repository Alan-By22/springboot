package com.ithuipu.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @className: MyController
 * @author: Mr.BingYu
 * @description:
 * @date: 2022/12/10 16:49
 **/

@RestController
public class MyController {


    /**
     * 关于springBoot的日志记录:springboot采用的是slf4j(日志门面,接口)+logback的日志实现
     * springboot也对日志,jul,log4j2的默认配置
     * 日志的作用:
     * 1.代码的调试
     * 2.项目|系统运营期间信息的记录
     * 1.日常运行信息
     * 2.报错的信息
     * 3.运维数据
     */

    private Logger log = LoggerFactory.getLogger(MyController.class);

    @RequestMapping("/sayHello")
    public String sayHello() {
        //记录日志
        //日志的级别
        //6个(TRACE,4,FATAL(合并到ERROR)),常用的4个(DEBUG|INFO|WARN|ERROR)
        log.debug("debug------");
        log.info("info------");
        log.warn("warn------");
        log.error("error------");
        return "<h2>sayHello----SpringBoot</h2>";
    }
}
