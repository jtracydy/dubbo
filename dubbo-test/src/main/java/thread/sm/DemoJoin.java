/*
*  2019 
*/
package thread.sm;

/**
 * @author wangdan Date: 2019/9/22 Time: 13:48
 * @version $Id$
 */
public class DemoJoin {


    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + " enter");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " out");

        });
        t1.start();
        t1.join(2000);
        try {
            System.out.println(Thread.currentThread().getName() + " execute method");
//            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName() + " end method");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}