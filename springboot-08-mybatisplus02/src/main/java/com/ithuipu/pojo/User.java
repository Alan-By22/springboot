package com.ithuipu.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @className: User
 * @author: Mr.BingYu
 * @description:
 * @date: 2022/12/07 13:27
 **/

@Data
//@TableName("t_user")
public class User {
    private Long id;
    private String name;

    /**
     * 添加TableField,更改与数据库不匹配的字段
     * 添加select ,不查询该字段
     */
    @TableField(value = "pwd",select = false)
    private String password;

    private Integer age;

    /**
     * 实体类中某些属性---不需要存储到数据库
     */
    @TableField(exist = false)
    private Integer pic;
}
