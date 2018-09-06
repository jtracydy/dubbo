package com.dubbo.spr.eg;

import org.junit.Test;

public class TestDemo {

    @Test
    public void insert(){
        ProxyUtils p = new ProxyUtils();
        DaoTest dd = new DaoTestImpl();
        DaoTest d = p.getBean(dd);
        d.get();
    }
}
