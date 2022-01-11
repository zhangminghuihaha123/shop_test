package com.zmh.springcloud.dao;

import com.zmh.springcloud.pojo.music_user;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface music_dao {

    public music_user selectall(String username);
}
