package proxy.testjavadynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 *
 * @param <T>
 */
public class Proxy<T> implements InvocationHandler{

    /**
     * 被代理类的真实对象
     */
    private T proxy;



    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return null;
    }
}
