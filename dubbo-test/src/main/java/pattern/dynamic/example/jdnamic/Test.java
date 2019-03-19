/*
*  2019 
*/
package pattern.dynamic.example.jdnamic;

/**
 * @author wangdan Date: 2019/3/12 Time: 16:13
 * @version $Id$
 */

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;


public class Test {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        MaotaiJiu maotaijiu = new MaotaiJiu();


        InvocationHandler jingxiao1 = new GuitaiA(maotaijiu);


        SellWine dynamicProxy = (SellWine) Proxy.newProxyInstance(MaotaiJiu.class.getClassLoader(),
                MaotaiJiu.class.getInterfaces(), jingxiao1);

        dynamicProxy.mainJiu();

    }

}


