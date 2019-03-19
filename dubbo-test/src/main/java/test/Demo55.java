/*
*  2019 
*/
package test;

import java.lang.reflect.Method;

/**
 * @author wangdan Date: 2019/3/18 Time: 10:42
 * @version $Id$
 */
public class Demo55 {

    public final  void get(){

    }

    public static void main(String[] args) {
        Class clazz = Demo55.class;
        Method[] methods = clazz.getMethods();
        for (int i = 0; i < methods.length; i++) {
            System.out.println(methods[i]);
        }
    }
}