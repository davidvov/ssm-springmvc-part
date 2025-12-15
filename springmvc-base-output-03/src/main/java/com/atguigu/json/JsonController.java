package com.atguigu.json;

import com.atguigu.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Mercurio
 * @date 2025/12/12 16:08
 * @description
 */
@RestController
@RequestMapping("json")
public class JsonController {


    @GetMapping("data")

    public User data(){
        User user = new User();
        user.setAge(18);
        user.setName("dog");

        return user;
    }

    @GetMapping("data1")

    public List<User> data2(){
        User user = new User();
        user.setAge(18);
        user.setName("dog");

        List<User> users = new ArrayList<>();
        users.add(user);
        return users;
    }
}