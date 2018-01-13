package com.yz.test.controller;

import com.yz.resp.UserODTO;
import com.yz.test.api.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private IUserService userService;

    @RequestMapping(value = "/feign-hello")
    public String feighHello() {
        return userService.hello();
    }

    @RequestMapping(value = "/feign-test", method = {RequestMethod.GET})
    public String helloConsumer2() {
        UserODTO userODTO = new UserODTO();
        userODTO.setName("jiangzeming");
        userODTO.setAge(90);

        StringBuilder sb = new StringBuilder();
        sb.append(userService.hello()).append("|");
        sb.append(userService.hello1("DIDI")).append("|");
        sb.append(userService.hello2("DIDI888", 30)).append("|");
        sb.append(userService.hello3(userODTO));
        return sb.toString();
    }
}


