package com.ithuipu.pojo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @className: Student
 * @author: Mr.BingYu
 * @description:
 * @date: 2022/12/05 17:59
 **/

@Data
@ConfigurationProperties("stu")
@Component
public class Student {
    private String name;
    private Integer age;
    private Date birthday;
    private boolean flag;
    private List<Cat> list;
    private Map<String, Object> map;
}
