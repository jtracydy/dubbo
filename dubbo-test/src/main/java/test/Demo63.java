/*
*  2019 
*/
package test;

/**
 * @author wangdan Date: 2019/4/4 Time: 10:03
 * @version $Id$
 */
public class Demo63 {

    public static void main(String[] args) {
        System.out.println(f(100));
    }


    public static int f(int n) {
        int t = 0;
        boolean b = (n > 0) && ((t = f(n - 1)) > 0);
        if (!b) {
            return n;
        }
        return n + t;
    }
}