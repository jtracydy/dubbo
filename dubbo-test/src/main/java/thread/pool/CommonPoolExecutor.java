/*
*  2019 
*/
package thread.pool;

import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author wangdan Date: 2019/7/8 Time: 10:33
 * @version $Id$
 */
public class CommonPoolExecutor {

    private static BlockingQueue blockingQueue = new LinkedBlockingDeque(10);

    private static ThreadFactory threadFactory = new ThreadPoolTaskExecutor();

    private static ThreadPoolExecutor.DiscardOldestPolicy discardOldestPolicy = new ThreadPoolExecutor.DiscardOldestPolicy();

    public static ThreadPoolExecutor getExetor(){
        return new ThreadPoolExecutor(10,15,10L, TimeUnit.MILLISECONDS,blockingQueue);
    }

}