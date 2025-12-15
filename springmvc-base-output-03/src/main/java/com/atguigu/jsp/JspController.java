package com.atguigu.jsp;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Mercurio
 * @date 2025/12/12 14:57
 * @description
 */

/**
 *  跳转到提交文件页面  /save/jump
 *
 *  如果要返回jsp页面!
 *     1.方法返回值改成字符串类型
 *     2.返回逻辑视图名即可
 *         <property name="prefix" value="/WEB-INF/views/"/>
 *            + 逻辑视图名 +
 *         <property name="suffix" value=".jsp"/>
 */
@Controller
@RequestMapping("jsp")
public class JspController {
    @GetMapping("index")
    public String index(HttpServletRequest request){
        request.setAttribute("data", "hello jsp!!!");
        System.out.println("JspController.index");
        return "index";
    }


    /*
    * - 将方法的返回值，设置String类型
      - 转发使用forward关键字，重定向使用redirect关键字
      - 关键字: /路径
      - 注意：如果是项目下的资源，转发和重定向都一样都是项目下路径！都不需要添加项目根路径！
    * */
    @GetMapping("forward")
    public String forward(){
        System.out.println("JspController.forward");
        return "forward:/jsp/index";
    }

    @GetMapping("redirect")
    public String redirect(){
        System.out.println("JspController.redirect");
        return "redirect:/jsp/index";
    }

    @GetMapping("redirectBaidu")
    public String redirectBaiDu(){
        System.out.println("JspController.redirectBaiDu");
        return "redirect:http://baidu.com";
    }
}


