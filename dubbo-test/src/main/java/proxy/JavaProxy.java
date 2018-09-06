package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JavaProxy implements InvocationHandler{

    private Object proxyObj;

    public <T> T getProxyObj(Object proxyObj){
        this.proxyObj = proxyObj;
        Object o = Proxy.newProxyInstance(proxyObj.getClass().getClassLoader(),proxyObj.getClass().getInterfaces(),  this);
        return (T)o;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before,,,,,");
        Object o = method.invoke(proxyObj,args);
        System.out.println("after,,,,,");
        return o;
    }
}
