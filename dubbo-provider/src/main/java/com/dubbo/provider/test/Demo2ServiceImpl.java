package com.dubbo.provider.test;

import com.dubbo.api.test.Demo2Service;
import org.springframework.stereotype.Service;


@Service("demo2Service")
public class Demo2ServiceImpl implements Demo2Service {

    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
