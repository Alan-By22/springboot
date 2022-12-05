package com.ithuipu.pojo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @className: Person
 * @author: Mr.BingYu
 * @description:
 * @date: 2022/12/05 17:40
 **/

@Data
@ConfigurationProperties(prefix = "person")
public class Person {
    private String name;
    private Integer age;
}
