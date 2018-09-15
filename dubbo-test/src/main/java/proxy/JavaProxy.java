package proxy;

//import com.google.common.collect.Lists;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JavaProxy implements InvocationHandler {

    private Object proxyObj;


    /**
     * Proxy 动态代理类动态创建代理对象
     * newProxyInstance() ->创建代理对象
     *
     * 仅仅提供一个代理类的入口，创建一个继承Proxy，实现被代理的类的所有接口，
     * 代理类会实现接口中定义的所有方法，
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

        System.out.println("proxy method......");
        Method[] methods = proxy.getClass().getDeclaredMethods();
//        Lists.newArrayList(methods).forEach(mm -> System.out.println(mm.getName()));

        System.out.println();

        System.out.println("被代理类proxy="+proxyObj.getClass().getName());
        System.out.println("代理类proxy="+proxy.getClass().getName());
        System.out.println("代理类->father="+proxy.getClass().getSuperclass().getName());
        System.out.println("代理类->father interface=");
        Class [] classes = proxy.getClass().getInterfaces();
        for (int i = 0; i < classes.length; i++) {
            System.out.println(classes[i].getName());
        }

        System.out.println("method=" + method);

        Object o = method.invoke(proxyObj, args);
        System.out.println((String)o);
        //Object o1 = method.invoke(proxy, args);


        System.out.println("after,,,,,");
        return null;
    }
}
