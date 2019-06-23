package com.sunbufu.dubbo.demo.service;

import java.util.List;
import java.util.Map;

public interface DemoService {

    String sayHi(String name);

    String printMap(Map<String, Object> map);

    String printUser(List<UserDTO> userList);

}
