package com.ithuipu.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @className: User
 * @author: Mr.BingYu
 * @description:
 * @date: 2022/12/06 17:41
 **/

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String name;
    private Integer age;
    private String address;
}
