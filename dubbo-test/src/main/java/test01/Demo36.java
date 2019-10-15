/*
*  2019 
*/
package test01;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author wangdan Date: 2019/9/23 Time: 08:52
 * @version $Id$
 */
public class Demo36 {


    public static void main(String[] args) throws ExecutionException, InterruptedException {
        BlockingQueue<Runnable> queue = new LinkedBlockingQueue<>();
        ThreadPoolExecutor executor = new ThreadPoolExecutor(10,15,100, TimeUnit.MILLISECONDS,queue);
        FutureTask futureTask = new FutureTask(()->{
            int k = 100+200;
            System.out.println(k);
            return k;
        });

        executor.execute(futureTask);
        try{
            Thread.sleep(1000);
        }catch (Exception e){

        }
        System.out.println(futureTask.get());

        executor.shutdown();


        System.out.println(";;;;;;;;");

    }
}