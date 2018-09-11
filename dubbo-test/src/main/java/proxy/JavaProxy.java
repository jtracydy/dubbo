package proxy;

import com.google.common.collect.Lists;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JavaProxy implements InvocationHandler {

    private Object proxyObj;


    /**
     * Proxy 动态代理类动态创建代理对象
     * newProxyInstance() ->创建代理对象
     *
     * @param proxyObj
     * @param <T>
     * @return
     */
    public <T> T getProxyObj(Object proxyObj) {
        this.proxyObj = proxyObj;
        Object o = Proxy.newProxyInstance(proxyObj.getClass().getClassLoader(), proxyObj.getClass().getInterfaces(), this);
        return (T) o;
    }

    /**
     * @param proxy  代理的真是对象，
     * @param method 调用真实对象的某个方法的method对象
     * @param args   参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before,,,,,");

        Method[] methods = proxy.getClass().getDeclaredMethods();
        Lists.newArrayList(methods).forEach(mm -> System.out.println(mm.getName()));

        System.out.println(proxyObj.getClass().getName());
        System.out.println(proxy.getClass().getName());

        System.out.println("method=" + method);

        Object o = method.invoke(proxyObj, args);

        //Object o1 = method.invoke(proxy, args);


        System.out.println("after,,,,,");
        return null;
    }
}
