package com.dubbo.consumer2.test;


import com.dubbo.api.test.LoginService;
import com.dubbo.common.test.api.req.UserAPIRequest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.stereotype.Service;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;


@Service
/**
 *RunWith运行期，
 * SpringJUnit4ClassRunner 让单元测试运行与spring的测试环境
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:springmvc-2.xml"})
public class LoginConsumerService {

    @Resource
    private LoginService loginService;

    @Test
    public void test(){
        UserAPIRequest user = new UserAPIRequest();
        user.setUserName("lucas");
        user.setPassword("123");
        System.out.println(loginService.login(user));
    }

}
