/*
*  2019 
*/
package thread.aqs;

import static java.lang.Thread.sleep;

/**
 * @author wangdan Date: 2019/9/2 Time: 16:59
 * @version $Id$
 */
public class Demo02Test {


    public static void main(String[] args) {
        final Demo02 bankServiceWindows = new Demo02(2);

        Thread t1 = new Thread(() ->{
            bankServiceWindows.lock();
            System.out.println("tom开始办理业务");
            try {
                sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("tom结束办理业务");
            bankServiceWindows.unlock();
        });

        Thread t2 =  new Thread(() ->{
            bankServiceWindows.lock();
            System.out.println("t2开始办理业务");
            try {
                sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("t2m结束办理业务");
            bankServiceWindows.unlock();
        });

        Thread t3 = new Thread(() ->{
            bankServiceWindows.lock();
            System.out.println("t3开始办理业务");
            try {
                sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("t3结束办理业务");
            bankServiceWindows.unlock();
        });
        t1.start();
        t2.start();
        t3.start();
    }

    static class ShareOperate implements Runnable{

        @Override
        public void run() {

            try {
                sleep(1000);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}