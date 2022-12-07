package com.ithuipu;

import com.ithuipu.dao.UserDao;
import com.ithuipu.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Springboot07Mybatisplus01ApplicationTests {


    /**注入dao*/
    @Autowired
    private UserDao userDao;

    /**查询*/
    @Test
    void contextLoads() {
        List<User> list = userDao.selectList(null);
        System.out.println(list);
    }

}
