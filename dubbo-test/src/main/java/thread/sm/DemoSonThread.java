/*
*  2019 
*/
package thread.sm;

/**
 * @author wangdan Date: 2019/9/22 Time: 14:33
 * @version $Id$
 */
public class DemoSonThread {

    public static void main(String[] args) {


        Thread t2 = new Thread(() -> {
            int i = 0;
            System.out.println(Thread.currentThread().getName());
            while (i < Integer.MAX_VALUE) {
                System.out.println("守护线程循环第" + i++);
            }
        });
        t2.setDaemon(true);
        t2.start();

        Thread t1 = new Thread(() -> {
            int i = 0;
            System.out.println(Thread.currentThread().getName());
            while (i < 100) {
                System.out.println("循环第" + i++);
            }
        });
        t1.start();

        System.out.println("main end.....");

    }
}