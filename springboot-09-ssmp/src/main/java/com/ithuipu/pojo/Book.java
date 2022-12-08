package com.ithuipu.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import org.springframework.context.annotation.Configuration;

/**
 * @className: Book
 * @author: Mr.BingYu
 * @description:
 * @date: 2022/12/08 18:40
 **/

@Data
public class Book {
    /**
     * 主键策略
     */
    @TableId(type = IdType.AUTO)
    private Integer id;
    private String type;
    private String name;
    private String description;
}
