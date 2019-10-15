/*
*  2019 
*/
package thread.sm;

/**
 * @author wangdan Date: 2019/9/22 Time: 14:09
 * @version $Id$
 */
public class DemoIsInterrupt {


    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            int i = 0;
            System.out.println(Thread.currentThread().getName());
            while (i < Integer.MAX_VALUE && !Thread.currentThread().isInterrupted()) {
                System.out.println("循环第" + i++);
            }
        });
        t1.start();
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        t1.interrupt();
        System.out.println(Thread.currentThread().getName() + " end");
    }
}