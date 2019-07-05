/*
*  2019 
*/
package thread.pool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author wangdan Date: 2019/1/3 Time: 11:04
 * @version $Id$
 */
public class Demo02 {


    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(5, 10, 10, TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(5), Executors.defaultThreadFactory());
        long start = System.currentTimeMillis();
        System.out.println(get());
        System.out.println(System.currentTimeMillis() - start);

        long start2 = System.currentTimeMillis();

        System.out.println(System.currentTimeMillis() - start2);

    }

    public static long get() {
        long sum = 0;
        for (long i = 0; i < 100000000L; i++) {
            sum = sum + i;
        }
        return sum;
    }
}