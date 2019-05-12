/*
*  2019 
*/
package test01;

import java.lang.ref.SoftReference;

/**
 * @author wangdan Date: 2019/5/9 Time: 14:17
 * @version $Id$
 */
public class Demo01 {

    public static void main(String[] args) {
        Integer i1 = 111;
        Integer i2 = 111;
        System.out.println(i1 == i2);
        Integer i3 = 222;
        Integer i4 = 222;
        System.out.println(i3 == i4);
        System.out.println(i3.equals(i4));


        SoftReference<String> softReference = new SoftReference<String>("hello");
        System.out.println(softReference.get());

        f();
        System.out.println(f());
    }

    public static int f() {
        try {
           // int a = 5 / 0;
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            return 2;
        }
    }
}