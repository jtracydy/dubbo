/*
*  2019 
*/
package arithematic;

/**
 * @author wangdan Date: 2019/4/27 Time: 11:58
 * @version $Id$
 */
public class Demo03 {


    public static void main(String[] args) {

    }

    public static int f(int n) {
        if (n == 1) {
            return 1;
        }
        return n * f(n - 1);
    }
}