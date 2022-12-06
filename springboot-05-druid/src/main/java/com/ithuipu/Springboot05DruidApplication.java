package com.ithuipu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.ithuipu.dao")
@SpringBootApplication
public class Springboot05DruidApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot05DruidApplication.class, args);
    }

}
