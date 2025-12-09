package com.atguigu.param;

import com.atguigu.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 *
 *
 * @author zlt
 * @date 2025-12-05
 */
@Controller
@RequestMapping("param")
public class ParamController {
    //直接接受
    @RequestMapping("data")
    @ResponseBody
    public String data(String name,int age){
        System.out.println("name = " + name + "," + "age = " + age);
        return "name = " + name + ", age = " + age;
    }
    //注解指定
    //指定任意的请求参数名 要求必须传递 要求不必须传递 给与一个默认值
    // /param/data1?account=root&page=1. account 必须传递，page可以不必须传递
    /*
    * @RequestParam -> 形参列表，指定请求参数名 或者是否必须传递 或者 非必须传递设置默认值
    *               用法： @RequestParam（value=“指定请求参数名，如果形参和请求参数名一致，可以省略”
    *                                    requied = false 前端是否需要传此参数，默认是必须
    *                                    defaultValue：设置默认值
    * */
    @RequestMapping("data1")
    @ResponseBody
    public String data1(@RequestParam(value="account") String account,
                        @RequestParam(required = false, defaultValue = "1") int page){
        System.out.println("account = " + account + ", page=" + page);
        return "account = " + account + ", page=" + page;
    }

    //特殊值
    //一名多值 key=1&key=2 直接使用集合接值即可
    //param/data2?hbs=吃&hbs=玩&hbs=学习
    //不加注解@RequestParam将hbs对应的一个字符串直接赋值给集合，类型异常
    //加了注解，经理就会将集合add加入对应的字符串
    @RequestMapping("data2")
    @ResponseBody
    public String data2(@RequestParam List<String> hbs){
        System.out.println("hbs = " + hbs);
        return "hbs=" +hbs;
    }

    //使用实体对象接值
    // param/data3?name="二狗子“&age=18 准备一个对应属性和get|set方法的实体类即可 ->形参列表声明对象参数即可
    @RequestMapping("data3")
    @ResponseBody
    public String data3(User user){
        System.out.println("user = " + user);
        return user.toString();
    }
}
