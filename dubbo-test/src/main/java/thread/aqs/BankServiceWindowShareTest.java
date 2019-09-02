/*
*  2019 
*/
package thread.aqs;

/**
 * @author wangdan Date: 2019/9/2 Time: 16:39
 * @version $Id$
 */
public class BankServiceWindowShareTest {

    public static void main(String[] args) {
        //final BankServiceWindowsShare bankServiceWindows = new BankServiceWindowsShare(2);
        final Demo02 bankServiceWindows = new Demo02(2);

        Thread tom = new Thread() {
            @Override
            public void run() {
                bankServiceWindows.lock();
                System.out.println("tom开始办理业务");
                try {
                    sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("tom结束办理业务");
                bankServiceWindows.unlock();
            }
        };
        Thread jim = new Thread() {
            @Override
            public void run() {
                bankServiceWindows.lock();
                System.out.println("jim开始办理业务");
                try {
                    sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("jim结束办理业务");
                bankServiceWindows.lock();
            }
        };
        Thread jay = new Thread() {
            @Override
            public void run() {
                bankServiceWindows.lock();
                System.out.println("jay开始办理业务");
                try {
                    sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("jay结束办理业务");
                bankServiceWindows.unlock();
            }
        };
        tom.start();
        jim.start();
        jay.start();
    }

}
