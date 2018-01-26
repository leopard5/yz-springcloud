package com.yz.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/ribbon/{id}", method = {RequestMethod.GET})
    public String findById(@PathVariable Long id) {
        return restTemplate.getForObject("http://eureka-provider/user/" + id, String.class);
    }

}


