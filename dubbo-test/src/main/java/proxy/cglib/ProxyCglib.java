package proxy.cglib;

import org.springframework.cglib.proxy.Callback;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class ProxyCglib implements MethodInterceptor {

    private static ProxyCglib proxyCglib = new ProxyCglib();

    private ProxyCglib(){

    }

    public static  <T> T getInstance(Class<T> clazz){
        return (T) Enhancer.create(clazz, (Callback) proxyCglib);
    }

    /**
     *
     * @param o            代理对象
     * @param method       代理方法
     * @param objects      参数
     * @param methodProxy  代理类对象
     * @return
     * @throws Throwable
     */

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        System.out.println("object= "+o.getClass().getName());
        System.out.println("method= "+method.getName());
        System.out.println("methodProxy"+methodProxy.getClass().getName());
        methodProxy.invokeSuper(o,objects);
        return null;
    }
}
