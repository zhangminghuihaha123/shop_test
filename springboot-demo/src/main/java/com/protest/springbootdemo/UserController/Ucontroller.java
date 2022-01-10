package com.protest.springbootdemo.UserController;
import com.protest.springbootdemo.po.User;
import com.protest.springbootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.awt.*;
import java.util.ArrayList;

@Controller
public class Ucontroller{

    private ArrayList shop=new ArrayList();

    private int cost=0;

    private String usershop;

    private int deletecount=0;

    @Autowired
    private UserService userService;

    @RequestMapping("shop")
    public String shop()
    {
       return "index.html";
    }

    @RequestMapping("zhuce")
    public String zhuce()
    {
        return "zhuce.html";
    }

    @RequestMapping("登录")
    public  String 登录()
    {
        return "登录.html";
    }
    @RequestMapping("我是管理员")
    public String 我是管理员()
    {
        return "我是管理员.html";
    }
    @RequestMapping("修改密码")
    public String 修改密码(HttpServletRequest request)
    {
        String username=request.getParameter("username");
        String newpassword=request.getParameter("password");
        userService.xiugaimima(username,newpassword);
        return "修改密码.html";
    }

    @RequestMapping("登录判定")
    public String 登录判定(HttpServletRequest request,HttpSession session)
    {
        String username=request.getParameter("username");
        String password1=request.getParameter("password");
        String password=(userService.usersearch(username)).getPassword();
        session.setAttribute("usersession1",username);
        String USERNAME=request.getParameter("username");
        String PASSWORD=(userService.usersearch(username)).getPassword();
        String AGE=(userService.usersearch(username)).getAge();
        String MONEY=(userService.usersearch(username)).getMoney();
        if(password.equals(password1))
        {
            request.setAttribute("message_username",USERNAME);
            request.setAttribute("message_password",PASSWORD);
            request.setAttribute("message_age",AGE);
            request.setAttribute("message_money",MONEY);
            usershop=request.getParameter("username");
           return "登录成功.html";
        }
        else
        {
            return "登录失败.html";
        }
    }
    @RequestMapping("管理员确认")
    public String 管理员确认(HttpServletRequest request,HttpSession session)
    {
        String username=request.getParameter("username");
        String password1=request.getParameter("password");
        session.setAttribute("adminusername",username);
        if(username.equals("admin"))
        {
            String password=(userService.chaxunguanliyuan(username)).getPassword();
            if(password1.equals(password))
            {
                return "管理员确认.html";
            }
            return "登录失败.html";
        }
        else
            {
            return "登录失败.html";
        }
    }


    @RequestMapping("返回注册页面")
    public String 返回注册页面()
    {
        return "zhuce";
    }
    @RequestMapping("退出登录")
    public String 退出登录()
    {
       usershop="";
       return "index.html";
    }



    @RequestMapping("jieshou")
    public String jieshou(HttpServletRequest request,User user)
    {
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        String age=request.getParameter("age");
        String money=request.getParameter("money");
        user.setUsername(username);
        user.setPassword(password);
        user.setAge(age);
        user.setMoney(money);
        if(user!=null)
        {
            userService.stat(user);
            request.setAttribute("usermessage",username);
            usershop=username;
            return "注册成功.html";
        }
        else
        {
            return null;
        }
    }

    @RequestMapping("进入商场")
    public String 进入商场(){

        return "进入商场.html";
    }

    @RequestMapping("子弹")
    public String 子弹()
    {
        return "子弹.html";
    }
    @RequestMapping("怪物")
    public String 怪物()
    {
        return "怪物.html";
    }
    @RequestMapping("星空")
    public String 星空()
    {
        return "星空.html";
    }
    @RequestMapping("购物车")
    public String 购物车(HttpServletRequest request)
    {
        request.setAttribute("shopping",shop);
        request.setAttribute("cost",cost);
        return "加入购物车.html";
    }
    @RequestMapping("加入购物车1")
    public String 加入购物车1(HttpServletRequest request,HttpSession session)
    {
        cost=cost+200;
        shop.add("子弹");
        request.setAttribute("shopping",shop);
        request.setAttribute("cost",cost);
        return  "进入商场.html";
    }
    @RequestMapping("加入购物车2")
    public String 加入购物车2(HttpServletRequest request,HttpSession session)
    {
        cost=cost+300;
        shop.add("怪物");
        request.setAttribute("shopping",shop);
        request.setAttribute("cost",cost);
        return  "进入商场.html";
    }
    @RequestMapping("加入购物车3")
    public String 加入购物车3(HttpServletRequest request,HttpSession session)
    {
        cost=cost+400;
        shop.add("星空");
        request.setAttribute("shopping",shop);
        request.setAttribute("cost",cost);
        return  "进入商场.html";
    }

    @RequestMapping("立即付款")
    public String 立即付款(HttpServletRequest request)
    {
        String money1=(userService.chaxun(usershop)).getMoney();
        int money=Integer.valueOf(money1);
        if(money>cost||money==cost)
        {
            int moneycost=money-cost;
            String costmoney=String.valueOf(moneycost);
            request.setAttribute("shengyu",costmoney);
            userService.costupdate(costmoney,usershop);
            if(userService.chaxunshoplist(usershop)==0)
            {
                userService.addshoplist(usershop,String.join(",",shop));
            }else
            {
                userService.updateshoplist(usershop,String.join(",",shop));
            }
            return "立即付款.html";
        }
        return "付款失败.html";
    }

    @RequestMapping("立即付款1")
    public String 立即付款1(HttpServletRequest request)
    {
        cost=cost+200;
        String money1=(userService.chaxun(usershop)).getMoney();
        int money=Integer.valueOf(money1);
        if(money>cost||money==cost)
        {
            int moneycost=money-cost;
            cost=0;
            String costmoney=String.valueOf(moneycost);
            request.setAttribute("shengyu",costmoney);
            userService.costupdate(costmoney,usershop);
            shop.add("子弹");
            if(userService.chaxunshoplist(usershop)==0)
            {
                userService.addshoplist(usershop,String.join(",",shop));
            }else
            {
                userService.updateshoplist(usershop,String.join(",",shop));
            }
            return "立即付款.html";
        }
        return "付款失败.html";
    }

    @RequestMapping("立即付款2")
    public String 立即付款2(HttpServletRequest request)
    {
        cost=cost+300;
        String money1=(userService.chaxun(usershop)).getMoney();
        int money=Integer.valueOf(money1);
        if(money>cost||money==cost)
        {
            int moneycost=money-cost;
            cost=0;
            String costmoney=String.valueOf(moneycost);
            request.setAttribute("shengyu",costmoney);
            userService.costupdate(costmoney,usershop);
            shop.add("怪物");
            if(userService.chaxunshoplist(usershop)==0)
            {
                userService.addshoplist(usershop,String.join(",",shop));
            }else
            {
                userService.updateshoplist(usershop,String.join(",",shop));
            }
            return "立即付款.html";
        }
        return "付款失败.html";
    }

    @RequestMapping("立即付款3")
    public String 立即付款3(HttpServletRequest request)
    {
        cost=cost+400;
        String money1=(userService.chaxun(usershop)).getMoney();
        int money=Integer.valueOf(money1);
        if(money>cost||money==cost)
        {
            int moneycost=money-cost;
            cost=0;
            String costmoney=String.valueOf(moneycost);
            request.setAttribute("shengyu",costmoney);
            userService.costupdate(costmoney,usershop);
            shop.add("星空");
            if(userService.chaxunshoplist(usershop)==0)
            {
                userService.addshoplist(usershop,String.join(",",shop));
            }else
            {
                userService.updateshoplist(usershop,String.join(",",shop));
            }
            return "立即付款.html";
        }
        return "付款失败.html";
    }

    @RequestMapping("我不想要了")
    public String 我不想要了()
    {
        cost=0;
        usershop="";
        shop.clear();
        return "我不想要了.html";
    }

    @RequestMapping("查看所有用户信息")
    public String 查看所有用户信息(HttpServletRequest request)
    {
        int num=userService.countuser();
        String number=String.valueOf(num);
        for(int i=0;i<num;i++)
        {
            request.setAttribute("user"+String.valueOf(i),userService.alluser((i+1)-1));
        }
        return "查看所有用户信息.html";
    }

    @RequestMapping("删除用户0")
    public String 删除用户0()
    {
        deletecount=0;
        String name=(userService.alluser(deletecount)).getUsername();
        userService.deleteuser(name);
        userService.deleteshoplist(name);
        deletecount=0;
        return "删除用户.html";
    }
    @RequestMapping("删除用户1")
    public String 删除用户1()
    {
        deletecount=1;
        String name=(userService.alluser(deletecount)).getUsername();
        userService.deleteuser(name);
        userService.deleteshoplist(name);
        deletecount=0;
        return "删除用户.html";
    }
    @RequestMapping("删除用户2")
    public String 删除用户2()
    {
        deletecount=2;
        String name=(userService.alluser(deletecount)).getUsername();
        userService.deleteuser(name);
        userService.deleteshoplist(name);
        deletecount=0;
        return "删除用户.html";
    }
    @RequestMapping("删除用户3")
    public String 删除用户3()
    {
        deletecount=3;
        String name=(userService.alluser(deletecount)).getUsername();
        userService.deleteuser(name);
        userService.deleteshoplist(name);
        deletecount=0;
        return "删除用户.html";
    }
    @RequestMapping("删除用户4")
    public String 删除用户4()
    {
        deletecount=4;
        String name=(userService.alluser(deletecount)).getUsername();
        userService.deleteuser(name);
        userService.deleteshoplist(name);
        deletecount=0;
        return "删除用户.html";
    }
    @RequestMapping("删除用户5")
    public String 删除用户5()
    {
        deletecount=5;
        String name=(userService.alluser(deletecount)).getUsername();
        userService.deleteuser(name);
        userService.deleteshoplist(name);
        deletecount=0;
        return "删除用户.html";
    }


    @RequestMapping("查看用户0")
    public String 查看用户0(HttpServletRequest request)
    {
        String show=String.join(",",(userService.showshoplist(0)).getShoplist());
        request.setAttribute("show",show);
        return "用户交易.html";
    }
    @RequestMapping("查看用户1")
    public String 查看用户1(HttpServletRequest request)
    {
        String show=String.join(",",(userService.showshoplist(1)).getShoplist());
        request.setAttribute("show",show);
        return "用户交易.html";
    }
    @RequestMapping("查看用户2")
    public String 查看用户2(HttpServletRequest request)
    {
        String show=String.join(",",(userService.showshoplist(2)).getShoplist());
        request.setAttribute("show",show);
        return "用户交易.html";
    }
    @RequestMapping("查看用户3")
    public String 查看用户3(HttpServletRequest request)
    {
        String show=String.join(",",(userService.showshoplist(3)).getShoplist());
        request.setAttribute("show",show);
        return "用户交易.html";
    }
    @RequestMapping("查看用户4")
    public String 查看用户4(HttpServletRequest request)
    {
        String show=String.join(",",(userService.showshoplist(4)).getShoplist());
        request.setAttribute("show",show);
        return "用户交易.html";
    }
    @RequestMapping("查看用户5")
    public String 查看用户5(HttpServletRequest request)
    {
        String show=String.join(",",(userService.showshoplist(5)).getShoplist());
        request.setAttribute("show",show);
        return "用户交易.html";
    }
}
