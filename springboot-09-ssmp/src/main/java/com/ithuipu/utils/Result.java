package com.ithuipu.utils;

import lombok.Data;

/**
 * @className: Result
 * @author: Mr.BingYu
 * @description:
 * @date: 2022/12/10 12:58
 **/

//前后台响应数据的格式
@Data
public class Result {
    private boolean flag;
    private Object data;
    private String msg;


    public Result(boolean flag, Object data, String msg) {
        this.flag = flag;
        this.data = data;
        this.msg = msg;
    }

    public Result(boolean flag, Object data) {
        this.flag = flag;
        this.data = data;
    }

    public Result(boolean flag, String msg) {
        this.flag = flag;
        this.msg = msg;
    }
}
