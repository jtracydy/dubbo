package com.dubbo.spr.annotation.dynamic;

public class Test {


    public static void main(String[] args) {

        RepostoryOperate repostoryOperate = ProxyUtils.getInstance(RepostoryOperate.class);
        repostoryOperate.delete("lucas","123");
    }
}
