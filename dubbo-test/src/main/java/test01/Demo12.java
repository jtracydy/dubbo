/*
*  2019 
*/
package test01;

/**
 * @author wangdan Date: 2019/7/19 Time: 16:59
 * @version $Id$
 */
public class Demo12 {

    public static void main(String[] args) {
        System.out.println(Son.str);
        /**
         * father static
         * father's variable
         */
    }

    static class Son extends Father {
        static {
            System.out.println("Son static");
        }
    }

    static class Father {
        static {
            System.out.println("father static");
        }

        static String str = "father's variable";
    }
}