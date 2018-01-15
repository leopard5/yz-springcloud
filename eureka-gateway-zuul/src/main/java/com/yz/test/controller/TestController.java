package com.yz.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {

    @RequestMapping("/local/hello")
    public String hello() {
        return "Hello World Local";
    }

}