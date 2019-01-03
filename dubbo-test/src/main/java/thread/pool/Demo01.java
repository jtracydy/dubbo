/*
*  2019 
*/
package thread.pool;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author wangdan Date: 2019/1/3 Time: 10:33
 * 线程池
 * @version $Id$
 */
public class Demo01 {

    public static void main(String[] args) {
//        Executor executor = Executors.newFixedThreadPool(10);

        BlockingDeque<Runnable> blockingDeque = new LinkedBlockingDeque(5);
        ThreadFactory factory = Executors.defaultThreadFactory();
        RejectedExecutionHandler handler = new ThreadPoolExecutor.DiscardOldestPolicy();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5,10,10,
                TimeUnit.SECONDS, blockingDeque,Executors.defaultThreadFactory(),handler);

        for (int i = 1; i <= 15 ; i++) {
            System.out.println("size="+blockingDeque.size());
            threadPoolExecutor.execute(new MyThread(i));
        }
    }
}

class MyThread implements Runnable{

    private Integer id;

    public MyThread(Integer id){
        this.id = id;
    }

    @Override
    public void run() {
        try{
            System.out.println(id+"======"+Thread.currentThread().getName());
            Thread.sleep(4000);
        }catch (Exception e){
            System.out.println(e);
        }

    }
}