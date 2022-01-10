package com.example.redis01.dao;

import com.example.redis01.pojo.user_np;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MyDao {

    public user_np adduser(user_np userNp);

    public user_np select(String name);

}
