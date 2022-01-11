package com.zmh.springcloud.service;

import com.zmh.springcloud.pojo.music_user;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class FeignServiceFactory implements FallbackFactory {
    @Override
    public Object create(Throwable throwable) {
        return new FeignService() {
            @Override
            public String selectall(String username) {
                music_user musicUser=new music_user();
                musicUser.setUsername("空");
                musicUser.setPassword("空");
                musicUser.setIsvip("空");
                return musicUser.toString()+",原因是服务端熔断.";
            }
        };
    }
}
