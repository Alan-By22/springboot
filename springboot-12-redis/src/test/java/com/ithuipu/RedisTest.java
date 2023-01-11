package com.ithuipu;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

/**
 * @className: RedisTest
 * @author: Mr.BingYu
 * @description:
 * @date: 2023/01/11 17:25
 **/


@SpringBootTest
public class RedisTest {

    //1.从容器中取模板对象
    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Test
    public void test1() {
        //string5种数据类型
        ValueOperations valueOperations = redisTemplate.opsForValue();
        valueOperations.set("age",18);
    }

    @Test
    public void test2() {
        //string5种数据类型
        ValueOperations<String, String> stringStringValueOperations = stringRedisTemplate.opsForValue();
        stringStringValueOperations.set("age","18");
    }
}
