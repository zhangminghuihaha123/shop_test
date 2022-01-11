package com.zmh.springcloud.controller;

import com.zmh.springcloud.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class cousumerController {

    @Autowired
    private FeignService feignService=null;

    @GetMapping("/user/{username}")
    public String selectall(@PathVariable("username") String username)
    {
        return feignService.selectall(username);
    }
}

