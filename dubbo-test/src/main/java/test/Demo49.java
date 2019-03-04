/*
*  2019 
*/
package test;

/**
 * @author wangdan Date: 2019/2/23 Time: 14:18
 * @version $Id$
 */
public class Demo49 {

    public static void main(String[] args) {


        try {
            deal();
        } catch (ArithmeticException e) {
            System.out.println("main......arException");
            e.printStackTrace();

        } catch (Exception e) {
            System.out.println("main.....Exception");
            e.printStackTrace();
        }
    }

    public static void deal() {
        for (int i = 0; i < 10; i++) {
            try {
                if (i == 5) {
                    System.out.println(5 / 0);
                    //throw new NullPointerException();
                }
                System.out.println(i);
            }
//            catch (Exception e) {
//                e.printStackTrace();
//            }
            finally {
                System.out.println("oooooooo");
            }

        }
    }
}