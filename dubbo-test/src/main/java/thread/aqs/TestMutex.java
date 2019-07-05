/*
*  2019 
*/
package thread.aqs;

/**
 * @author wangdan Date: 2019/5/13 Time: 15:54
 * @version $Id$
 */
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.atomic.AtomicInteger;

public class TestMutex {
    private static CyclicBarrier barrier = new CyclicBarrier(31);
    private static int a = 0;
    private static AtomicInteger v = new AtomicInteger(0);
    private static Mutex mutex = new Mutex();

    public static void main(String[] args) throws Exception {
        //说明:我们启用30个线程，每个线程对i自加10000次，同步正常的话，最终结果应为300000；
        //未加锁前
        for (int i = 0; i < 30; i++) {

            new Thread(()->{
                for (int j = 0; j < 10000; j++) {
                    increment1();//没有同步措施的a++；
                }
                try {
                    barrier.await();//等30个线程累加完毕
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }).start();
        }


        barrier.await();
        System.out.println("加锁前，a=" + a);
        System.out.println(v);
        //加锁后
        barrier.reset();//重置CyclicBarrier
        a = 0;
        v = new AtomicInteger(0);
        for (int i = 0; i < 30; i++) {
            new Thread(()->{
                for (int j = 0; j < 10000; j++) {
                    increment2();//a++采用Mutex进行同步处理
                }
                try {
                    barrier.await();//等30个线程累加完毕
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }).start();
        }
        barrier.await();
        System.out.println("加锁后，a=" + a);
        System.out.println(v);
    }

    /**
     * 没有同步措施的a++
     *
     * @return
     */
    public static void increment1() {
        a++;
        v.incrementAndGet();
    }

    /**
     * 使用自定义的Mutex进行同步处理的a++
     */
    public static void increment2() {
        mutex.lock();
        a++;
        v.incrementAndGet();
        mutex.unlock();
    }
}
