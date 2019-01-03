/*
*  2019 
*/
package thread.cff;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author wangdan Date: 2019/1/3 Time: 19:34
 * @version $Id$
 */
public class Demo01 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(1,1,0, TimeUnit.SECONDS, new LinkedBlockingDeque<>());
        Future<Integer> future = executor.submit(new MyTask());
        executor.shutdown();
        System.out.println(future.get());
    }
}

class MyTask implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum = sum + i;
        }
        return sum;
    }
}