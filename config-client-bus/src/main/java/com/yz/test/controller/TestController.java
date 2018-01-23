package com.yz.test.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
//@Configuration
public class TestController {
    private final Logger logger = LoggerFactory.getLogger(TestController.class);

    @Value("${redisabc}")
    private String gitYamlKey;
    @Value("${qiyz.test.name}")
    private String gitYamlKey1;

    @RequestMapping(value = "/client", method = {RequestMethod.GET})
    public String client() {
        return gitYamlKey + "|" + gitYamlKey1;
    }
}
