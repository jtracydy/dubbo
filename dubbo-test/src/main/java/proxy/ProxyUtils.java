package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyUtils implements InvocationHandler{

    /**
     * 被代理对象
     */
    private Object target;

    public ProxyUtils(Object target){
        this.target = target;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before,,,,,");
        Object o = method.invoke(target,args);
        System.out.println("after,,,,,");
        return o;
    }
}
