/*
*  2019 
*/
package test;

/**
 * @author wangdan Date: 2019/2/16 Time: 11:32
 * @version $Id$
 */
public class Demo44 {

    public static void main(String[] args) {
        Integer ii1 = 1;
        Integer i1 = 1;

        Integer ii2 = 200;
        Integer i2 = 200;

        Integer ii3 = 3;
        Long l = 3l;
        Integer i3 =1;
        Integer i4 =2;
        System.out.println(ii1 == i1);
        System.out.println(ii2 == i2);
        System.out.println(ii2.equals(i2));
        System.out.println(ii3 == (i3+i4));
        System.out.println(l.equals (i3+i4));
//        true
//        false
//        true
//        true
//        false
    }
}