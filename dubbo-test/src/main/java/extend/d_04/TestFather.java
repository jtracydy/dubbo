/*
*  2019 
*/
package extend.d_04;

import java.lang.reflect.Method;

/**
 * @author wangdan Date: 2019/3/18 Time: 10:50
 * @version $Id$
 */
public class TestFather {


    public static void main(String[] args) {
        Class clazz = Son.class;

        Son son = new Son();
        son.get();
        Method[] methos = clazz.getMethods();
        for (int i = 0; i < methos.length; i++) {
            System.out.println(methos[i]);
        }
    }
}