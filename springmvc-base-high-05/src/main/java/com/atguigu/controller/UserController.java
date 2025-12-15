package com.atguigu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Mercurio
 * @date 2025/12/15 14:39
 * @description 两个测试异常
 */
@RestController
@RequestMapping("user")
public class UserController {

    @GetMapping("data")
    public String data(){
        String name = null;
        name.toString();
        return "ok";
    }

    @GetMapping("data1")
    public String data1(){
        int i=1/0;
        return "ok";
    }
}
