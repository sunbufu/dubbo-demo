package com.sunbufu.dubbo.demo.controller;

import com.sunbufu.dubbo.demo.service.DemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @org.apache.dubbo.config.annotation.Reference(version = "1.0.0", check = false)
    private DemoService demoService;

    @GetMapping("sayHi")
    public String sayHi(String name){
        return demoService.sayHi(name);
    }

}
