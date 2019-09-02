/*
*  2019 
*/
package lock;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author wangdan Date: 2019/8/24 Time: 10:48
 * @version $Id$
 */
public class Demo02 {
    private ReentrantReadWriteLock rwl = new ReentrantReadWriteLock();

    public static void main(String[] args) {
        final Demo02 test = new Demo02();

        new Thread(() -> test.get(Thread.currentThread())).start();

        new Thread(() -> test.get(Thread.currentThread())).start();
    }

    public void get(Thread thread) {
        rwl.readLock().lock();
        try {
            long start = System.currentTimeMillis();

            while (System.currentTimeMillis() - start <= 1) {
                System.out.println(thread.getName() + "正在进行读操作");
            }
            System.out.println(thread.getName() + "读操作完毕");
        } finally {
            rwl.readLock().unlock();
        }
    }
}