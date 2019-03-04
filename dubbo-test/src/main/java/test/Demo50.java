/*
*  2019 
*/
package test;

/**
 * @author wangdan Date: 2019/2/25 Time: 14:15
 * @version $Id$
 */
public class Demo50 {


    public static void main(String[] args) {

        int a = 0;
        try {
            a = 5 / 0;
        } catch (ArithmeticException e) {
            try {
                a = 5 / 0;
            } catch (ArithmeticException e1) {
                System.out.println("inter.......");
                e.printStackTrace();
            }
        } catch (Exception e) {
            System.out.println("outer.......");
            e.printStackTrace();
        }
    }
}