package com.zmh.springcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.zmh.springcloud.service.music_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class music_controller {

    @Autowired
    private music_service musicService;

    @HystrixCommand(fallbackMethod = "getselect") //熔断机制
    @GetMapping("/select/{username}")
    public String selectall(@PathVariable("username") String username)
    {
        return (musicService.selectall(username)).toString();
    }


    public String getselect(@PathVariable("username") String username)
    {
        return "熔断";
    }
}
