package com.protest.springbootdemo.dao;

import com.protest.springbootdemo.po.User;
import com.protest.springbootdemo.po.admin;
import com.protest.springbootdemo.po.shop;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserDao {

    public User userdao(User user);

    public User usershop(String username);

    public User userupdatecost(String money,String username);

    public User userchaxun(String username);

    public User xiugaimima(String username,String password);

    public admin chaxunguanliyuan(String username);

    public User alluser(int number);

    public int countuser();

    public User deleteuser(String username);

    public shop addshoplist(String username,String shoplist);

    public int chaxunshoplist(String username);

    public shop updateshoplist(String username,String shoplist);

    public shop showshoplist(int number);

    public shop deleteshoplist(String username);

}
