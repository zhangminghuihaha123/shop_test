package com.example.redis01.service;

import com.example.redis01.dao.MyDao;
import com.example.redis01.pojo.user_np;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    @Autowired
    private MyDao myDao;

    public user_np adduser(user_np userNp)
    {
        return myDao.adduser(userNp);
    }

    public user_np select(String name)
    {
        return myDao.select(name);
    }

}
