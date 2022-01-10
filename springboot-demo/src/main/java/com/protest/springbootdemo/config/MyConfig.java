package com.protest.springbootdemo.config;

import com.protest.springbootdemo.InterCeptor.myinterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class MyConfig implements WebMvcConfigurer {

    public void addInterceptors(InterceptorRegistry registry)
    {
        HandlerInterceptor interceptor=new myinterceptor();
        List list=new ArrayList();
        list.add("/我是管理员");
        list.add("/我是管理员.html");
        list.add("/shop");
        list.add("/管理员确认");
        list.add("/登录失败.html");
        list.add("/zhuce");
        list.add("/登录");
        list.add("/index.html");
        list.add("/zhuce.html");
        list.add("/jieshou");
        list.add("/注册成功.html");
        list.add("/退出登录");
        list.add("/登录.html");
        list.add("/登录判定");
        list.add("/修改密码");
        list.add("/查看所有用户信息");
        list.add("/查看所有用户信息.html");
        list.add("/删除用户0");
        list.add("/删除用户1");
        list.add("/删除用户2");
        list.add("/删除用户3");
        list.add("/删除用户4");
        list.add("/删除用户5");
        list.add("/删除用户.html");
        list.add("/查看用户0");
        list.add("/查看用户1");
        list.add("/查看用户2");
        list.add("/查看用户3");
        list.add("/查看用户4");
        list.add("/查看用户5");
        list.add("/用户交易.html");
        registry.addInterceptor(interceptor).addPathPatterns("/**").excludePathPatterns(list);
    }
}
