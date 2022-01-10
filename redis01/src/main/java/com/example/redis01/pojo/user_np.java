package com.example.redis01.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
public class user_np implements Serializable {
    private String name;
    private String password;
    private String numb;
}
