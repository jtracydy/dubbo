/*
*  2019 
*/
package thread.volat;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author wangdan Date: 2019/2/19 Time: 10:37
 * @version $Id$
 */
public class Demo01 {

   // private static  AtomicInteger value = new AtomicInteger(0);
    private static  int value = 0;
    private static CountDownLatch countDownLatch = new CountDownLatch(100);

    /**
     * volatile 关键字
     */

    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 10000; i++) {
            new Thread(() -> {
                increment();
                countDownLatch.countDown();
            }).start();
        }
        countDownLatch.await();
        System.out.println(value);
    }

    public static void increment() {
      //  value.incrementAndGet();
        value++;
    }
}