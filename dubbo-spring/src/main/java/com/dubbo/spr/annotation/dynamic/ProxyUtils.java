package com.dubbo.spr.annotation.dynamic;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyUtils implements InvocationHandler {


    public static  <T> T getInstance(Class object) {
        final ProxyUtils methodProxy = new ProxyUtils();
        return (T) Proxy.newProxyInstance(
                Thread.currentThread().getContextClassLoader(),
                new Class[]{object},
                methodProxy);

    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        if (method.isAnnotationPresent(Insert.class)) {
            System.out.println(method.getAnnotation(Insert.class).value());
        }

        if (method.isAnnotationPresent(Delete.class)) {
            System.out.println(method.getAnnotation(Delete.class).value());
        }

        System.out.println(method.getName());

        return null;
    }
}
