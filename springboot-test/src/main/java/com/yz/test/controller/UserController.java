package com.yz.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

@RestController
//@ConfigurationProperties(prefix = "test")
/**
 *
 */
public class UserController {

//    @Autowired
//    DataSource dataSource;

    @RequestMapping("/user")
    public String hello() {
        return "aaaaa";
    }

//    @RequestMapping("/dbpool")
//    public String test() {
//        return dataSource.getClass().toString();
//    }
}
