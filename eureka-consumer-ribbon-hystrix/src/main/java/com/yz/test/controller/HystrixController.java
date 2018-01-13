package com.yz.test.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HystrixController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/ribbon/{id}", method = {RequestMethod.GET})
    @HystrixCommand(fallbackMethod = "findByIdFallBack")
    public String findById(@PathVariable Long id) {
        return restTemplate.getForObject("http://eureka-provider/user/" + id, String.class);
    }

    public String findByIdFallBack(Long id) {
        return "findByIdFallBack=" + String.valueOf(id);
    }

}


