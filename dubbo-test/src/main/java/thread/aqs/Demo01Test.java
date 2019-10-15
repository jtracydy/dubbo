/*
*  2019 
*/
package thread.aqs;

import java.util.concurrent.CyclicBarrier;

/**
 * @author wangdan Date: 2019/9/2 Time: 15:47
 * @version $Id$
 */
public class Demo01Test {

    private static int total = 0;
    private static Demo01 d = new Demo01();

    private static Mutex mutex = new Mutex();


    public static void main(String[] args) throws Exception {

        CyclicBarrier barrier = new CyclicBarrier(30);
        for (int i = 0; i < 30; i++) {

            new Thread(() -> {
                for (int j = 0; j < 10000; j++) {
                    add();
                }
                try {
                    barrier.await();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }).start();
        }
        System.out.println(Thread.currentThread().getName());
        barrier.await();
        System.out.println(total);

        total = 0;
        for (int i = 0; i < 30; i++) {

            new Thread(() -> {
                for (int j = 0; j < 10000; j++) {
                    mutexAdd();
                }
                try {
                    barrier.await();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }).start();
        }
        barrier.await();
        System.out.println(total);
    }

    private static void add() {
        d.lock();
        total++;
        d.unlock();
    }

    private static void mutexAdd() {
        mutex.lock();
        total++;
        mutex.unlock();
    }
}