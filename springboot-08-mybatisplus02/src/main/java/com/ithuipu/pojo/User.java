package com.ithuipu.pojo;

import com.baomidou.mybatisplus.annotation.*;
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
    @TableId(type = IdType.AUTO)//IdType.AUTO使用数据库的自增主键策略
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

    /**逻辑删除*/
    //@TableLogic(value = "0",delval = "1")
    private Integer flag;
}
