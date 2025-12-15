package com.atguigu.controller;

import com.atguigu.pojo.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Mercurio
 * @date 2025/12/15 13:51
 * @description
 */
@RestController
@RequestMapping("user")
public class UserController {
    @GetMapping
    public List<User> page(@RequestParam(required = false,defaultValue = "1") int page,
                           @RequestParam(required = false,defaultValue = "10") int size){
        System.out.println("page = " + page + ", size = " + size);
        return null;
    }

    @PostMapping
    public User save(@RequestBody User user){
        return user;
    }

    @GetMapping("{id}")
    public User detail(@PathVariable Integer id){
        return null;
    }

    @PutMapping
    public User update(@RequestBody User user){
        return null;
    }

    @DeleteMapping("{id}")
    public User delete(Integer id){
        return null;
    }

    @GetMapping("search")
    public List<User> search(String keyword,
                             @RequestParam(required = false,defaultValue = "1")int page,
                             @RequestParam(required = false,defaultValue = "10")int size){
        System.out.println("keyword = " + keyword + ", page = " + page + ", size = " + size);
        return null;
    }

}
