/*
*  2019 
*/
package thread.CyclicBarBarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @author wangdan Date: 2019/1/3 Time: 17:21
 * @version $Id$
 */
public class Demo01 {

    /**
     * cyclicBarrier 当多个线程公共达到某个状态时，线程才能继续执行，
     * @param args
     */

    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(4,()->{
            System.out.println(Thread.currentThread().getName());
        });

        for (int i = 0; i < 4; i++) {
            new Write(cyclicBarrier,i).start();
        }

    }
}


class Write extends Thread{

    private CyclicBarrier cyclicBarrier;

    private int num;

    public Write(CyclicBarrier cyclicBarrier,int num){
        this.cyclicBarrier = cyclicBarrier;
        this.num = num;
    }

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName()+" start write");
            if(num / 2 == 0){
                Thread.sleep(5000);
                System.out.println(Thread.currentThread().getName()+" is writing " + 5000);
            }
            else{
                Thread.sleep(3000);
                System.out.println(Thread.currentThread().getName()+" is writing " + 3000);
            }
            cyclicBarrier.await();
            System.out.println(Thread.currentThread().getName()+" is ok");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}