package proxy.testjavadynamic;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Lists;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 *
 */
public class ProxyDynamic implements InvocationHandler{

    /**
     * 被代理类的真实对象
     */
    private Object proxy;

    public <T> T getProxy(T object){
        proxy = (T)object;

        return (T)Proxy.newProxyInstance(object.getClass().getClassLoader(),object.getClass().getInterfaces(), this);

    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("全局对象proxy"+this.proxy.getClass().getName());

        System.out.println("方法对象proxy"+proxy.getClass().getName());

        Lists.newArrayList(proxy.getClass().getMethods()).forEach( o -> System.out.println(o));

        Object result = method.invoke(this.proxy,args);

        System.out.println(JSON.toJSONString((CoffeeEntity)result));
        return null;
    }
}
