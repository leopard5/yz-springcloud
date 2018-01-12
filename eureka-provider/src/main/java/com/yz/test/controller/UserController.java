package com.yz.test.controller;

import com.alibaba.fastjson.JSON;
import com.yz.test.vo.UserVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private final Logger logger = LoggerFactory.getLogger(UserController.class);

    @RequestMapping(value = "/user/{id}", method = {RequestMethod.GET})
    public String getUser(@PathVariable Long id) {
        UserVO userVO = new UserVO();
        userVO.setId(id);
        userVO.setName("harry");
        userVO.setAge(32);
        userVO.setMobile("18501620335");
        return JSON.toJSONString(userVO);
    }
}


