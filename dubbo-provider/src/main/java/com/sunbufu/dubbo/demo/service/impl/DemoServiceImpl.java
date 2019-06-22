package com.sunbufu.dubbo.demo.service.impl;

import com.sunbufu.dubbo.demo.service.DemoService;
import org.springframework.stereotype.Service;

@Service
@org.apache.dubbo.config.annotation.Service(version = "1.0.0")
public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHi(String name) {
        System.out.println("receive a request for sayHi with param name=[" + name + "]");
        return "Hi " + name + ", this is dubbo-provider.";
    }
}
