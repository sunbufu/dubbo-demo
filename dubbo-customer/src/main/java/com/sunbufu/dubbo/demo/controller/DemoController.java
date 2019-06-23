package com.sunbufu.dubbo.demo.controller;

import com.sunbufu.dubbo.demo.service.DemoService;
import com.sunbufu.dubbo.demo.service.UserDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@RestController
public class DemoController {

    @org.apache.dubbo.config.annotation.Reference(version = "1.0.0", check = false)
    private DemoService demoService;

    @GetMapping("sayHi")
    public String sayHi(String name){
        return demoService.sayHi(name);
    }

    @GetMapping("echo")
    public String echo(@RequestParam Map<String, Object> map){
        return demoService.printMap(map);
    }

    @GetMapping("echoUser")
    public String echoUser(String userName, String sex){
        UserDTO user = new UserDTO();
        user.setUserName(userName);
        user.setSex(sex);
        return demoService.printUser(Collections.singletonList(user));
    }
}
