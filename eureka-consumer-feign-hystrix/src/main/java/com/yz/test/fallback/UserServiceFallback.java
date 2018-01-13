package com.yz.test.fallback;

import com.yz.resp.UserODTO;
import com.yz.test.api.IUserService;
import org.springframework.stereotype.Component;

@Component
public class UserServiceFallback implements IUserService {
    @Override
    public String hello() {
        return "error";
    }

    @Override
    public String hello1(String name) {
        return "error";
    }

    @Override
    public UserODTO hello2(String name, Integer age) {
        UserODTO user = new UserODTO();
        user.setName("error");
        user.setAge(0);
        return null;
    }

    @Override
    public String hello3(UserODTO user) {
        return "error";
    }
}
