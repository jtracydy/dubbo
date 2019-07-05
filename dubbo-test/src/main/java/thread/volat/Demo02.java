/*
*  2019 
*/
package thread.volat;

import java.util.concurrent.CountDownLatch;

/**
 * @author wangdan Date: 2019/5/12 Time: 11:57
 * @version $Id$
 */
public class Demo02 {

    private static volatile int value;
    private static CountDownLatch countDownLatch = new CountDownLatch(10000);

    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 10000; i++) {
            new Thread() {
                @Override
                public void run() {
                    increment();
                    countDownLatch.countDown();
                }
            }.start();

        }
        countDownLatch.await();
        System.out.println(getValue());
    }

    public static int increment() {
        return value++;
    }

    public static int getValue() {
        return value;
    }
}