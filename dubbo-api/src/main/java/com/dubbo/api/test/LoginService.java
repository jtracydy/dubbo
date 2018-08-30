package com.dubbo.api.test;

import com.dubbo.common.test.api.req.UserAPIRequest;

public interface LoginService {


     String login(UserAPIRequest user);
}
