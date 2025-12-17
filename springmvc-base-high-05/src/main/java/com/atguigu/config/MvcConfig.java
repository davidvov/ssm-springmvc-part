package com.atguigu.config;

import com.atguigu.interceptor.MyInterceptor;
import com.atguigu.interceptor.MyInterceptor1;
import jakarta.servlet.http.HttpServlet;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

/**
 * @author Mercurio
 * @date 2025/12/12 14:49
 * @description
 */
@EnableWebMvc  //json数据处理,必须使用此注解,因为他会加入json处理器
@Configuration
@ComponentScan({"com.atguigu.controller","com.atguigu.error"}) //TODO: 进行controller扫描

//WebMvcConfigurer springMvc进行组件配置的规范,配置组件,提供各种方法! 前期可以实现
public class MvcConfig implements WebMvcConfigurer {

    //开启静态资源查找
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer){
        configurer.enable();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry){
        //配置方案1；拦截所有请求
//        registry.addInterceptor(new MyInterceptor());
        //配置方案2：拦截指定地址
        // 支持 * 任意一层字符串   ** 任意多层字符串
//        registry.addInterceptor(new MyInterceptor())
//                .addPathPatterns("/user/data");
//        //配置方案3：排除拦截 排除的地址应该在拦截地址内部;即exclude需要再addpath的路径下
//        registry.addInterceptor(new MyInterceptor())
//                .addPathPatterns("/user/**").excludePathPatterns(("/user/data1"));
        //先声明的优先级高，优先级高的在外层
        registry.addInterceptor(new MyInterceptor());
        registry.addInterceptor(new MyInterceptor1());
    }
}