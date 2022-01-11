package com.zmh.springcloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(value = "SPRINGCLOUD-PROVIDER",fallbackFactory = FeignServiceFactory.class)
public interface FeignService
{

    @GetMapping("/select/{username}")
    public String selectall(@PathVariable("username") String username);

}
