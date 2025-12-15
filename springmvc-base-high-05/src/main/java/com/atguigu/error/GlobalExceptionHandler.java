package com.atguigu.error;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author Mercurio
 * @date 2025/12/15 14:42
 * @description 全局异常处理
 */
@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler
    public Object ArithmeticExceptionHandler(ArithmeticException e){
        String message = e.getMessage();
        System.out.println("message = " + message);
        return message;
    }

    @ExceptionHandler
    public Object Exception(Exception e){
        String message = e.getMessage();
        System.out.println("message = " + message);
        return message;
    }
}
