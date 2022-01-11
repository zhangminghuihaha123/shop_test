package com.zmh.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.zmh.springcloud.service"})
public class Cousumer_8003 {
    public static void main(String[] args) {
        SpringApplication.run(Cousumer_8003.class,args);
    }
}
