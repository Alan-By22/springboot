package com.ithuipu.pojo;

import lombok.Data;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @className: User
 * @author: Mr.BingYu
 * @description:
 * @date: 2022/12/05 17:26
 **/

@Data
@ConfigurationProperties(prefix = "user")
@Component
public class User {
    private String username;
    private Integer age;
}
