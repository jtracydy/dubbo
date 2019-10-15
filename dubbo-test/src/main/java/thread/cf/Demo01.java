/*
*  2019 
*/
package thread.cf;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author wangdan Date: 2019/10/15 Time: 09:08
 * @version $Id$
 */
public class Demo01 {

    public static void main(String[] args) throws  Exception{
        ThreadPoolExecutor executor = new ThreadPoolExecutor(10, 10, 10, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<>());
        CompletableFuture<String> f1 = CompletableFuture.supplyAsync(() -> {
            return "zero";
        }, executor);

        f1.thenAccept((e)->{
            System.out.println(e);
        });

//        CompletableFuture<Integer> f2 = f1.thenApply((t) -> {
//           return  t.length();
//        });
//
//        CompletableFuture<Double> f3 = f2.thenApply(r -> r * 2.0);
//        System.out.println(f3.get());
//        executor.shutdown();
    }
}