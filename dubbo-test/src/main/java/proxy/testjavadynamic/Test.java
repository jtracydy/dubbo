/*
* Copyright (c) 2018 Qunar.com. All Rights Reserved.
*/
package proxy.testjavadynamic;

/**
 * @author wangdan Date: 2018/10/17 Time: 17:22
 * @version $Id$
 */
public class Test {

    public static void main(String[] args) {
        ProxyDynamic proxy = new ProxyDynamic();
        Coffee coffee = new Mocha();
        proxy.getProxy(coffee).name(3);
    }
}