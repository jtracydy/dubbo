package proxy.jadynamic;

import org.junit.Test;

public class TestProxy {

    @Test
    public void test(){

//        Hello h = new HelloImpl();
//        ProxyUtils proxyUtils = new ProxyUtils(h);
//
//        Hello hello = (Hello)ProxyDynamic.newProxyInstance(h.getClass().getClassLoader(),h.getClass().getInterfaces(),proxyUtils);
//        hello.sayHello();

        Hello h1 = new HelloImpl();
        JavaProxy javaProxy = new JavaProxy();
        Hello hh =javaProxy.getProxyObj(h1);
        System.out.println(hh.getClass().getName());
        hh.getStr();
    }
}
