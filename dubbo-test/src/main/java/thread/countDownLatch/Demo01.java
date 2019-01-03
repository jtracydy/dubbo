/*
*  2019 
*/
package thread.countDownLatch;

import java.util.concurrent.CountDownLatch;

/**
 * @author wangdan Date: 2019/1/3 Time: 17:05
 * @version $Id$
 */
public class Demo01 {

    /**
     * countDownLatch 多个线程共同达到某个状态才能继续向下执行
     * @param args
     */
    public static void main(String[] args) {
         final CountDownLatch countDownLatch = new CountDownLatch(2);
         new Thread(()->{
             try{
                 Thread.sleep(4000);
                 countDownLatch.countDown();
                 System.out.println(Thread.currentThread().getName());
             }catch (Exception e){
                 System.out.println(e);
             }

         }).start();

         new Thread(()->{
             try{
                 Thread.sleep(3000);
                 countDownLatch.countDown();
                 System.out.println(Thread.currentThread().getName());
             }catch (Exception e){
                 System.out.println(e);
             }

         }).start();

         try{
             countDownLatch.await();
             System.out.println("..........");
         }catch (Exception e){
             System.out.println(e);
         }

    }
}