package com.dubbo.spr.jano;


@Msg(msg = "TestDemo")
@Demo
public class Test {


    @Property(value = "test_val",name = "test_name",length = "test_len")
    public void get() {
        System.out.println("..........");
    }
}
