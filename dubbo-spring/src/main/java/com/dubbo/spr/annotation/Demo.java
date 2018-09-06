package com.dubbo.spr.annotation;


import org.springframework.stereotype.Component;

@Component("demo")
public class Demo {


    public void get(String name) {
        System.out.println("component demo..." + name);
    }
}
