package com.ithuipu.pojo;

import org.springframework.context.annotation.Configuration;

/**
 * @className: User
 * @author: Mr.BingYu
 * @description: TODO 类描述
 * @date: 2022/12/05 15:10
 **/


public class User {
    private String name;
    private Integer age;

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
