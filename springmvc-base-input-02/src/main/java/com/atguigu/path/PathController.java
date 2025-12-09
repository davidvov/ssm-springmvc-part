package com.atguigu.path;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 路径参数演示
 *
 * @author zlt
 * @date 2025-12-08
 */
@Controller
@RequestMapping("path")
@ResponseBody
public class PathController {
    //path/账号/密码

    //动态路径设计 {key} = * {key} 在形参列表获取传入的参数
    //动态路径设计必须使用PathVariable注解
    @RequestMapping("{account}/{password}")
    public String login(@PathVariable(value = "account") String account,@PathVariable(value="password") String password){
        System.out.println("account = " + account + ", password = " + password);
        return "account = " + account + ", password = " + password;
    }
}
