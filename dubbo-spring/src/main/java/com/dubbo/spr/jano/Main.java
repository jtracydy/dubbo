package com.dubbo.spr.jano;



public class Main {


    public static void main(String[] args) {
        Test test = new Test();
        Class tClass = test.getClass();
        Msg msg = (Msg) tClass.getAnnotation(Msg.class);
        System.out.println(msg.msg());
    }
}