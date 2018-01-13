package com.yz.test.api;

import com.yz.resp.UserODTO;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient("eureka-provider")
public interface IUserService {

    @RequestMapping("/hello")
    String hello();

    @RequestMapping(value = "/hellol", method = RequestMethod.GET)
    String hello1(@RequestParam("name") String name);

    @RequestMapping(value = "/hello2", method = RequestMethod.GET)
    UserODTO hello2(@RequestHeader("name") String name, @RequestHeader("age") Integer age);

    @RequestMapping(value = "/hello3", method = RequestMethod.POST)
    String hello3(@RequestBody UserODTO user);
}
