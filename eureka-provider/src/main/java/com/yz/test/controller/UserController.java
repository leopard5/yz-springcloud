package com.yz.test.controller;

import com.alibaba.fastjson.JSON;
import com.yz.resp.UserODTO;
import com.yz.test.config.ServiceInfoUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    private final Logger logger = LoggerFactory.getLogger(UserController.class);

    @RequestMapping(value = "/user/{id}", method = {RequestMethod.GET})
    public String getUser(@PathVariable Long id) {
        UserODTO userVO = new UserODTO();
        userVO.setId(id);
        userVO.setName("harry");
        userVO.setAge(32);
        userVO.setMobile("18501620335");
        userVO.setServerPort(ServiceInfoUtil.getPort());
        return JSON.toJSONString(userVO);
    }

    @RequestMapping(value = "/hello", method = {RequestMethod.GET})
    public String hello() {
        return "hello" + String.valueOf(ServiceInfoUtil.getPort());
    }


    @RequestMapping(value = "/hellol", method = RequestMethod.GET)
    public String hello1(@RequestParam String name) {
        return "Hello " + name + String.valueOf(ServiceInfoUtil.getPort());
    }

    @RequestMapping(value = "/hello2", method = RequestMethod.GET)
    public UserODTO hello2(@RequestHeader String name, @RequestHeader Integer age) {
        UserODTO user = new UserODTO();
        user.setName(name);
        user.setAge(age);
        user.setServerPort(ServiceInfoUtil.getPort());
        return user;
    }

    @RequestMapping(value = "/hello3", method = RequestMethod.POST)
    public String hello3(@RequestBody UserODTO userODTO) {
        return "Hello " + userODTO.getName() + ", " + userODTO.getAge() + ", port=" + ServiceInfoUtil.getPort();
    }
}
