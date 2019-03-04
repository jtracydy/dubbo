/*
*  2019 
*/
package test;

/**
 * @author wangdan Date: 2019/2/28 Time: 14:33
 * @version $Id$
 */
public class Demo51 {


    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            if (i == 5) {
                throw new RuntimeException();
            }
        }
    }
}