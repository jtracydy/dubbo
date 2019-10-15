/*
*  2019 
*/
package thread.sm;

/**
 * @author wangdan Date: 2019/9/22 Time: 14:21
 * @version $Id$
 */
public class DemoIsInterrupt02 {

    private volatile static boolean b = false;

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            int i = 0;
            System.out.println(Thread.currentThread().getName());
            while (i < Integer.MAX_VALUE && !b) {
                System.out.println("循环第" + i++);
            }
            System.out.println("b=" + b);
        });
        t1.start();
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        b = true;

    }
}