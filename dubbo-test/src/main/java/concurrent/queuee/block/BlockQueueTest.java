/*
*  2019 
*/
package concurrent.queuee.block;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * @author wangdan Date: 2019/7/5 Time: 16:05
 * @version $Id$
 */
public class BlockQueueTest {

    private static ArrayBlockingQueue<Integer> arrayBlockingQueue = new ArrayBlockingQueue<>(10);

    public static void main(String[] args) {

        new Thread(new Consumer()).start();

        new Thread(new Producer()).start();

    }

    static class Consumer implements Runnable {

        @Override
        public void run() {
            while (true) {
                try {
                    Integer i = arrayBlockingQueue.take();
                    System.out.println("queue take =" + i);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static class Producer implements Runnable {
        static int i = 10;

        @Override
        public void run() {
            while (true) {
                try {
                    if (i > 0) {
                        arrayBlockingQueue.put(i--);
                        System.out.println("queue put =" + i);
                    } else {
                        System.out.println("break");
                        break;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}