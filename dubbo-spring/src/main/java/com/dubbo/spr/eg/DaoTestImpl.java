package com.dubbo.spr.eg;

public class DaoTestImpl implements DaoTest{


    @Override
    @Insert("insert all")
    public void get() {
        System.out.println("insert......");
    }
}
