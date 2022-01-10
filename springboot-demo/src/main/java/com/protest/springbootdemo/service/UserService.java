package com.protest.springbootdemo.service;

import com.protest.springbootdemo.dao.UserDao;
import com.protest.springbootdemo.po.User;
import com.protest.springbootdemo.po.admin;
import com.protest.springbootdemo.po.shop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {

    @Resource
    private UserDao userdao;

    @Resource
    private UserDao usershop;

    @Resource
    private UserDao userupdatecost;

    @Resource
    private UserDao userchaxun;

    @Resource
    private UserDao xiugaimima;

    @Resource
    private UserDao chaxunguanliyuan;

    @Resource
    private UserDao alluser;

    @Resource
    private UserDao countuser;

    @Resource
    private UserDao deleteuser;

    @Resource
    private UserDao addshoplist;

    @Resource
    public UserDao chaxunshoplist;

    @Resource
    public UserDao updateshoplist;

    @Resource
    public UserDao showshoplist;

    @Resource
    public UserDao deleteshoplist;


    public User stat(User user)
    {
        return userdao.userdao(user);
    }

    public User chaxun(String username)
    {
        return usershop.usershop(username);
    }

    public User costupdate(String money,String username)
    {
        return userupdatecost.userupdatecost(money,username);
    }

    public User usersearch(String username)
    {
        return userchaxun.userchaxun(username);
    }

    public User xiugaimima(String username,String password)
    {
        return xiugaimima.xiugaimima(username,password);
    }

    public admin chaxunguanliyuan(String username)
    {
        return chaxunguanliyuan.chaxunguanliyuan(username);
    }

    public User alluser(int number)
    {
        return alluser.alluser(number);
    }

    public int countuser()
    {
        return countuser.countuser();
    }

    public User deleteuser(String username)
    {
        return deleteuser.deleteuser(username);
    }

    public shop addshoplist(String username,String shoplist)
    {
        return addshoplist.addshoplist(username,shoplist);
    }

    public int chaxunshoplist(String username)
    {
        return chaxunshoplist.chaxunshoplist(username);
    }

    public shop updateshoplist(String username,String shoplist)
    {
        return updateshoplist.updateshoplist(username,shoplist);
    }

    public shop showshoplist(int number)
    {
        return showshoplist.showshoplist(number);
    }

    public shop deleteshoplist(String username)
    {
        return deleteshoplist.deleteshoplist(username);
    }
}
