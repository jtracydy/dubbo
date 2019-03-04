/*
*  2019 
*/
package test;

/**
 * @author wangdan Date: 2019/3/4 Time: 15:18
 * @version $Id$
 */
public class Demo52 {

    static {
        System.out.println("dddddddd");
    }

    public static void main(String[] args) {

    }

    public static class InnerDemo52{
        public static final  Demo52 d = new Demo52();
        {
            System.out.println("dddd");
        }
    }
}