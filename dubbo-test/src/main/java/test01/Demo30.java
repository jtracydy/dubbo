/*
*  2019 
*/
package test01;


/**
 * @author wangdan Date: 2019/9/8 Time: 16:00
 * @version $Id$
 */
public class Demo30 {

    private static volatile boolean b = false;


    public static void main(String[] args) {
        new Thread(() -> {
            while (!b) {
                System.out.println("b=" + b);
            }
            System.out.println("b=" + b);
        }).start();

        new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            b = true;
        }).start();

    }
}