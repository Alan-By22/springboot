package com.ithuipu;

import com.ithuipu.config.MyConfiguration;
import com.ithuipu.pojo.Person;
import com.ithuipu.pojo.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @className: BootApplication
 * @author: Mr.BingYu
 * @description: TODO 类描述
 * @date: 2022/12/05 14:09
 **/
//@ComponentScan("com")
@SpringBootApplication  //springboot的应用
public class BootApplication {
    public static void main(String[] args) {
        //spring的容器
        ConfigurableApplicationContext run = SpringApplication.run(BootApplication.class, args);
        //User user = (User) run.getBean("user");
//        User bean = run.getBean(User.class);
//        System.out.println(bean);
//1.
//        MyConfiguration myConfiguration = run.getBean(MyConfiguration.class);
//        User user = myConfiguration.user();
//        User user1 = myConfiguration.user();
//        System.out.println(user==user1);
        //2.
        User user = (User) run.getBean("user2");
        System.out.println(user);
    }
}
