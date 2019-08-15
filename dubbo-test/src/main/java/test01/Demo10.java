/*
*  2019 
*/
package test01;

import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author wangdan Date: 2019/7/8 Time: 10:12
 * @version $Id$
 */
public class Demo10 {


    public static void main(String[] args) throws Exception{
        BlockingQueue blockingQueue = new ArrayBlockingQueue(10);
        ThreadPoolExecutor executor1 = new ThreadPoolExecutor(10,15,10L, TimeUnit.MILLISECONDS,blockingQueue);

        ThreadFactory threadFactory = new ThreadPoolTaskExecutor();
        ThreadPoolExecutor executor2 = new ThreadPoolExecutor(10,15,10L, TimeUnit.MILLISECONDS,blockingQueue,threadFactory);
        ThreadPoolExecutor executor3 = new ThreadPoolExecutor(10,15,10L, TimeUnit.MILLISECONDS,blockingQueue,threadFactory, new ThreadPoolExecutor.DiscardOldestPolicy());


    }
}