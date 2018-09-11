package proxy.mult;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyDynamic implements InvocationHandler {


    private Object obj;

    public <T> T getPrxy(Object obj) {
        this.obj = obj;
        return (T) Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println(proxy.getClass().getName());
        System.out.println(proxy.getClass().getSuperclass());


        System.out.println("before.....");
        System.out.println("className:" + obj.getClass().getName());
        System.out.println("method:" + method);
        System.out.println("arg" + args);
        method.invoke(obj, args);
        System.out.println("after.....");

        return null;
    }
}
