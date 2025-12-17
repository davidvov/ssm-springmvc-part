package com.atguigu.controller;

import com.atguigu.pojo.User;
import org.springframework.validation.annotation.Validated;
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

    //接收用户数据，用户有校验注解
    /*
    * 步骤1：实体类属性添加校验注解
    * 步骤2：handler（@Validated 实体类 对象）
    * 细节 param | json 校验注解都有效果
    *       json参数- @RequstBody
    * */
    public User register(@Validated User user){
        System.out.println("true = " + true);
        return user;
    }

    @GetMapping("data")
    public String data(){
        String name = null;
        System.out.println("UserController.data");
//        name.toString();
        return "ok";
    }

    @GetMapping("data1")
    public String data1(){
//        int i=1/0;
        System.out.println("UserController.data1");
        return "ok";
    }
}
