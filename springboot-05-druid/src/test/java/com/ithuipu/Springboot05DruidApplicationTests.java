package com.ithuipu;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@SpringBootTest
class Springboot05DruidApplicationTests {

    //注入数据源
    private DataSource dataSource;
    @Test
    void contextLoads() {
        //System.out.println(dataSource);
        try {
            Connection connection = dataSource.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
