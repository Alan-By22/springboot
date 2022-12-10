package com.ithuipu.utils;

import com.baomidou.mybatisplus.extension.api.R;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @className: ProjectExceptionAdvice
 * @author: Mr.BingYu
 * @description:
 * @date: 2022/12/10 13:03
 **/

//统一异常处理
@RestControllerAdvice
public class ProjectExceptionAdvice {
    @ExceptionHandler(Exception.class)
    public Result doOtherException(Exception ex) {
        //记录日志
        //发送消息给运维
        //发送邮件给开发人员,ex对象发送给开发人员
        ex.printStackTrace();
        return new Result(false, null, "系统错误，请稍后再试！");
    }
}
