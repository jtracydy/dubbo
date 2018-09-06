package proxy;

import org.junit.Test;

import java.lang.reflect.Proxy;

public class TestProxy {

    @Test
    public void test(){

        Hello h = new HelloImpl();
        ProxyUtils proxyUtils = new ProxyUtils(h);
        /**
         * 类加载器
         * 实现类的接口
         * 动态代理对象
         */
        Hello hello = (Hello)Proxy.newProxyInstance(h.getClass().getClassLoader(),h.getClass().getInterfaces(),proxyUtils);
        hello.sayHello();

        Hello h1 = new HelloImpl();
        JavaProxy javaProxy = new JavaProxy();
        Hello hh =javaProxy.getProxyObj(h1);
        hh.sayBybye();
    }
}
