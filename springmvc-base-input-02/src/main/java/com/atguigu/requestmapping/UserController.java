package com.atguigu.requestmapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.rmi.registry.Registry;

/**
 *
 *
 * @author zlt
 * @date 2025-12-05
 */
@Controller
@RequestMapping("user")//类上添加提供通用的访问地址
public class UserController {

    /*
    * @WebServlet("必须使用/开头")
    *
    * @RequestMapping(不用必须使用/开头) user/login /user/login都可
    *
        指定请求方式加method；
        * 进阶指定，在方法上添加@GetMapping
    */
    //handler->handleMapper指定访问地址
    @RequestMapping(value = "login" , method = RequestMethod.POST)//作用是注册地址 将handler注册到handlerMapping
    public String login(){
        return null;
    }

    @PostMapping
    @RequestMapping(value = "register" , method = RequestMethod.GET)
    public String register(){
        return null;
    }
}
