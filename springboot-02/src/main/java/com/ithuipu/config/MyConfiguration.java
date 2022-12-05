package com.ithuipu.config;

import com.ithuipu.pojo.Person;
import com.ithuipu.pojo.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * @className: MyConfiguration
 * @author: Mr.BingYu
 * @description:
 * @date: 2022/12/05 15:22
 **/
@Import(Person.class)
@ImportResource("classpath:beans.xml")
@ConditionalOnMissingBean(name = "person")
@Configuration(proxyBeanMethods = false)  //配置类--xml---<bean>set注入,构造器注入</bean>
public class MyConfiguration {

    /**
     * 1.添加组件
     * 将方法的返回值添加到容器,该组件的id就是方法名--user
     */
    @Bean
    public User user() {
        return new User("李四", 23);
    }
}
