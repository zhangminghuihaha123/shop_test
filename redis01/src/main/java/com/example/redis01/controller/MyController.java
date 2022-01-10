package com.example.redis01.controller;

import com.example.redis01.pojo.user_np;
import com.example.redis01.service.MyService;
import com.example.redis01.utils.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.concurrent.TimeUnit;

@Controller
public class MyController {

    private String card;

    @Autowired
    private RedisUtil redisUtil;

    @Autowired
    private MyService myService;

    @RequestMapping("/index")
    public String index()
    {
        return "index.html";
    }

    @RequestMapping("zhuce")
    public String zhuce()
    {
        return "zhuce.html";
    }

    @RequestMapping("zhuce2")
    public String zhuce2(HttpServletRequest request)
    {
        String chars="0123456789QWERTYUIOPASDFGHJKLZXCVBNMabcdefghijklmnopqrstuvwxyz";
        StringBuffer value=new StringBuffer();
        for(int i=0;i<5;i++)
        {
            value.append(chars.charAt((int)(Math.random()*62)));
        }
        String num=value.toString();
        if(redisUtil.hasKey("key"))
        {
           redisUtil.del("key");
           redisUtil.set("key",num);
           request.setAttribute("messages",num);
           redisUtil.expire("key",120, TimeUnit.SECONDS);
           card=num;
        }
        else
        {
            redisUtil.set("key",num);
            request.setAttribute("messages",num);
            redisUtil.expire("key",120, TimeUnit.SECONDS);
            card=num;
        }
        return "zhuce.html";
    }

    @RequestMapping("check")
    public String check(HttpServletRequest request)
    {
        if(request.getParameter("number").equals(redisUtil.get("key")))
        {
            if(request.getParameter("username").equals("")||request.getParameter("password").equals("")) {
                return "error.html";
            }
            else
            {
                user_np userNp = new user_np();
                userNp.setName(request.getParameter("username"));
                userNp.setPassword(request.getParameter("password"));
                userNp.setNumb(card);
                myService.adduser(userNp);
            }
        }
        else
        {
            return "error.html";
        }
        return "index.html";
    }

    @RequestMapping("denglu")
    @ResponseBody
    public String yanzheng(HttpServletRequest request)
    {
        if(request.getParameter("password").equals((myService.select(request.getParameter("username"))).getPassword()))
        {
            return myService.select(request.getParameter("username")).toString();
        }
        else
        {
            return "error";
        }
    }


}
