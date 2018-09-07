package proxy;

import org.junit.Test;

import java.lang.reflect.Proxy;

public class TestProxy {

    @Test
    public void test(){

//        Hello h = new HelloImpl();
//        ProxyUtils proxyUtils = new ProxyUtils(h);
//
//        Hello hello = (Hello)Proxy.newProxyInstance(h.getClass().getClassLoader(),h.getClass().getInterfaces(),proxyUtils);
//        hello.sayHello();

        Hello h1 = new HelloImpl();
        JavaProxy javaProxy = new JavaProxy();
        Hello hh =javaProxy.getProxyObj(h1);
        hh.sayBybye();
    }
}
