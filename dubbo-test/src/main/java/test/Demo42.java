/*
*  2019 
*/
package test;

/**
 * @author wangdan Date: 2019/2/2 Time: 09:43
 * @version $Id$
 */
public class Demo42 {


    public static void main(String[] args) {

        try {
            for (int i = 0; i < 10; i++) {
                try {
                    if (i == 5) {
                        throw new RuntimeException();
                    }
                    System.out.println(i);
                } catch (NullPointerException e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}