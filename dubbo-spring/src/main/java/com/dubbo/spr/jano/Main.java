package com.dubbo.spr.jano;


import java.lang.reflect.Method;

public class Main {

    /**
     * 通过反射可以得到类中所有的注解。
     *
     * 通过java动态代理获得任意类的所有注解
     *
     * @param args
     */

    public static void main(String[] args) {
        Test test = new Test();
        Class tClass = test.getClass();
//        Msg msg = (Msg) tClass.getAnnotation(Msg.class);
//        System.out.println(msg.msg());


        Demo demo = (Demo) tClass.getAnnotation(Demo.class);
        System.out.println(demo.demo());


        Method[] method = tClass.getMethods();
        for (int i = 0; i < method.length; i++) {
            Method m = method[i];
            if (m.isAnnotationPresent(Property.class)) {
                Property properties = method[i].getAnnotation(Property.class);
                System.out.println(properties.value() + " " + properties.name());
            }
        }

//        Property property  = (Property) tClass.getAnnotation(Property.class);
//        System.out.println(property.value());
    }
}