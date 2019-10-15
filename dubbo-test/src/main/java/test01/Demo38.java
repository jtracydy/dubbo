/*
*  2019 
*/
package test01;

import java.util.concurrent.Semaphore;

/**
 * @author wangdan Date: 2019/9/23 Time: 15:30
 * @version $Id$
 */
public class Demo38 {

    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(5);

        for (int i = 0; i < 8; i++) {
            new Thread(
                    () -> {
                        try {
                            semaphore.acquire();
                            System.out.println(Thread.currentThread().getName()+" 执行任务");
                            Thread.sleep(2000);
                            System.out.println(Thread.currentThread().getName()+" 任务结束");
                            semaphore.release();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                    }
            ).start();
        }

    }
}