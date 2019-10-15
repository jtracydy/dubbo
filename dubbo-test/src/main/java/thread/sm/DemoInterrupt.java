/*
*  2019 
*/
package thread.sm;

/**
 * @author wangdan Date: 2019/9/22 Time: 14:03
 * @version $Id$
 */
public class DemoInterrupt {

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + " start");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " end");

        });
        t1.start();
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        t1.interrupt();
        System.out.println(Thread.currentThread().getName() + " end");

    }
}