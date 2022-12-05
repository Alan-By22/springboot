package com.ithuipu;

import com.ithuipu.pojo.Person;
import com.ithuipu.pojo.Student;
import com.ithuipu.pojo.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;

@EnableConfigurationProperties(Person.class)
@SpringBootApplication
public class Springboot03quickstartApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(Springboot03quickstartApplication.class, args);
//        User bean = run.getBean(User.class);
//        System.out.println(bean);
        Student student = run.getBean(Student.class);
        System.out.println(student);
    }

}
