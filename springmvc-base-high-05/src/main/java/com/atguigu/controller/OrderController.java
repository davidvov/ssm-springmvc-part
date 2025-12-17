package com.atguigu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试方案2
 *
 * @author zlt
 * @date 2025-12-17
 */
@RestController
@RequestMapping("order")
public class OrderController {

    @GetMapping("data")
    public String data(){
        System.out.println("OrderController.data");
//        name.toString();
        return "ok";
    }

    @GetMapping("data1")
    public String data1(){
//        int i=1/0;
        System.out.println("OrderController.data1");
        return "ok";
    }
}