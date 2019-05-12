/*
*  2019 
*/
package test01;

import java.util.ArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author wangdan Date: 2019/5/11 Time: 12:22
 * @version $Id$
 */
public class Demo03 {


    private ArrayList<Integer> arrayList = new ArrayList<Integer>();
    private static Lock lock = new ReentrantLock();    //注意这个地方

    public static void main(String[] args) {
        final Demo03 test = new Demo03();

        new Thread() {
            public void run() {
                test.insert(Thread.currentThread());
            }

            ;
        }.start();

        new Thread() {
            public void run() {
                test.insert1(Thread.currentThread());
            }

            ;
        }.start();
    }

    public void insert(Thread thread) {
        lock.lock();
        try {
            System.out.println(thread.getName() + "得到了锁");
            Thread.sleep(5000);
        } catch (Exception e) {
            // TODO: handle exception
        } finally {
            System.out.println(thread.getName() + "释放了锁");
            lock.unlock();
        }
    }

    public static void insert1(Thread thread) {
        lock.lock();
        try {
            System.out.println(thread.getName() + "得到了锁");
        } catch (Exception e) {
            // TODO: handle exception
        } finally {
            System.out.println(thread.getName() + "释放了锁");
            lock.unlock();
        }
    }
}