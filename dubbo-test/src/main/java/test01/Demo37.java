/*
*  2019 
*/
package test01;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author wangdan Date: 2019/9/23 Time: 15:08
 * @version $Id$
 */
public class Demo37 {


    public static void main(String[] args) throws Exception {
        BlockingQueue<Runnable> blockingQueue = new LinkedBlockingQueue<>();
        ThreadPoolExecutor executor = new ThreadPoolExecutor(5, 10, 100, TimeUnit.MILLISECONDS, blockingQueue);
        CountDownLatch countDownLatch = new CountDownLatch(5);
        System.out.println(Thread.currentThread().getName()+" execute start");
        int count = 0;
        for (int i = 0; i < 5; i++) {

            Future<Integer> future = executor.submit(() -> {
                System.out.println("execute name " + Thread.currentThread().getName());
                int total = 0;
                for (int j = 0; j < 100; j++) {
                    total += j;
                }
                countDownLatch.countDown();
                return total;
            });
            count = +future.get();
        }
        countDownLatch.await();
        System.out.println(Thread.currentThread().getName()+" execute end");
        System.out.println(count);
        executor.shutdown();
    }
}