package com.dubbo.provider.test;

import com.dubbo.api.test.DemoService;
import org.springframework.stereotype.Service;

@Service("demoService")
public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello(String name) {
        // TODO Auto-generated method stub
        return name;
    }
}