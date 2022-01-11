package com.zmh.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Eureka_8001 {

    public static void main(String[] args) {
        SpringApplication.run(Eureka_8001.class,args);
    }
}
