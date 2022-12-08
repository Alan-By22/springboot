package com.ithuipu.pojo;

import lombok.Data;

/**
 * @className: User
 * @author: Mr.BingYu
 * @description:
 * @date: 2022/12/07 13:27
 **/

@Data
public class User {
    private Long id;
    private String name;
    private String password;
    private Integer age;
}
