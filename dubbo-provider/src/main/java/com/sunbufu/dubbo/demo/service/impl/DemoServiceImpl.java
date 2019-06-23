package com.sunbufu.dubbo.demo.service.impl;

import com.sunbufu.dubbo.demo.service.DemoService;
import com.sunbufu.dubbo.demo.service.UserDTO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@org.apache.dubbo.config.annotation.Service(version = "1.0.0")
public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHi(String name) {
        System.out.println("receive a request for sayHi with param name=[" + name + "]");
        return "Hi " + name + ", this is dubbo-provider.";
    }

    @Override
    public String printMap(Map<String, Object> map) {
        System.out.println("receive a request for printMap with param map=[" + map + "]");
        return map.toString();
    }

    @Override
    public String printUser(List<UserDTO> userList) {
        System.out.println("receive a request for printMap with param userList=[" + userList + "]");
        return userList.toString();
    }
}
