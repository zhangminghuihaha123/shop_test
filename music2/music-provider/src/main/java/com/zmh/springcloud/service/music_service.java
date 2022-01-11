package com.zmh.springcloud.service;

import com.zmh.springcloud.dao.music_dao;
import com.zmh.springcloud.pojo.music_user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class music_service {

    @Autowired
    private music_dao musicDao;

    public music_user selectall(String username)
    {
        return musicDao.selectall(username);
    }
}
