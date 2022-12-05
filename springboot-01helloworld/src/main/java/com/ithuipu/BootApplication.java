package com.ithuipu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @className: BootApplication
 * @author: Mr.BingYu
 * @description: TODO 类描述
 * @date: 2022/12/05 14:09
 **/

@SpringBootApplication  //springboot的应用
public class BootApplication {
    public static void main(String[] args) {
        //spring的容器
        ConfigurableApplicationContext run = SpringApplication.run(BootApplication.class, args);
        //bean
        String[] beanDefinitionNames = run.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
    }
}
