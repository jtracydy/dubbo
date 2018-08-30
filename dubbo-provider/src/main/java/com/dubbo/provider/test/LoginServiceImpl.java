package com.dubbo.provider.test;

import com.alibaba.fastjson.JSON;
import com.dubbo.api.test.LoginService;
import com.dubbo.common.test.api.req.UserAPIRequest;
import org.springframework.stereotype.Service;

@Service("loginService")
public class LoginServiceImpl implements LoginService{

    @Override
    public String login(UserAPIRequest user) {

        if(user.getPassword().equals("123")&&user.getUserName().equals("lucas")){
            return "welcome dubbo";
        }
        return JSON.toJSONString("see goodbye");
    }
}
