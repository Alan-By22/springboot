package com.ithuipu.controller;

import lombok.extern.slf4j.Slf4j;
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

@Slf4j
@RestController
public class MyController2 {

    @RequestMapping("/sayHello2")
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
