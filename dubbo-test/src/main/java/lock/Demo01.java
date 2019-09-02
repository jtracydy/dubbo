/*
*  2019 
*/
package lock;

/**
 * @author wangdan Date: 2019/8/24 Time: 10:43
 * @version $Id$
 */
public class Demo01 {


        public static void main(String[] args)  {
            final Demo01 test = new Demo01();



            new Thread(){
                public void run() {
                    test.get(Thread.currentThread());
                };
            }.start();

            new Thread(){
                public void run() {
                    test.get(Thread.currentThread());
                };
            }.start();

        }

        public synchronized void get(Thread thread) {
            long start = System.currentTimeMillis();
            while(System.currentTimeMillis() - start <= 1) {
                System.out.println(thread.getName()+"正在进行读操作");
            }
            System.out.println(thread.getName()+"读操作完毕");
        }
}