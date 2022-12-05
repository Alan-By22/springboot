package com.ithuipu.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import javax.print.PrintService;

/**
 * @className: Person
 * @author: Mr.BingYu
 * @description:
 * @date: 2022/12/05 15:59
 **/

@Data
@AllArgsConstructor  //有参构造
@NoArgsConstructor  //无参构造
@ToString
public class Person {
    private String name;
    private String address;
}


class Demo{
    public static void main(String[] args) {
        //1.
        Person person = new Person();
        //2.
        person.setName("lisi111");
        //3.
        System.out.println(person);
    }
}