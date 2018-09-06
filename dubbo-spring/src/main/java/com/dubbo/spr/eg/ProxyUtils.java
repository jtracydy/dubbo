package com.dubbo.spr.eg;


import java.lang.reflect.Proxy;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyUtils implements InvocationHandler{

    /**
     * 代理的对象
     */
    private Object target;

    public  <T> T getBean(Object target){
        this.target = target;
        return (T)Proxy.newProxyInstance
                (target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }

    /**
     *
     * @param proxy  代理类
     * @param method 代理类真实对象所要调用的真实的方法
     * @param args： 调用真实方法的参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        /**
         * 利用反射代用被代理类的方法
         */
        String value = method.getAnnotation(Insert.class).value();
        System.out.println(value);
        return null;
    }
}
