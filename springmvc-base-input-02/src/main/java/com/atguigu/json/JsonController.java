package com.atguigu.json;

import com.atguigu.pojo.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 *
 * @author zlt
 * @date 2025-12-08
 */
@RequestMapping("json")
@Controller
@ResponseBody
public class JsonController {
    //data -> 请求体 POST {name,age,gender}；；Java原生的api，只支持param和路径参数。不支持json
    //解决：导入json处理的依赖；handlerAdapter配置json转化器
    @PostMapping("data")
    public String data(@RequestBody Person person){
        System.out.println("person = " + person);
        return person.toString();
    }
}