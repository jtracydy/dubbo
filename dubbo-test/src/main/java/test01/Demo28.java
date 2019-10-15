/*
*  2019 
*/
package test01;

/**
 * @author wangdan Date: 2019/9/8 Time: 12:09
 * @version $Id$
 */
public class Demo28 {



    public static void main(String[] args) throws Exception{

        new Thread(()->{
            System.out.println(Demo29.getMap());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(()->{
            Demo29.getMap().put("4","4");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println( Demo29.getMap());
        }).start();

        new Thread(()->{
            System.out.println( Demo29.getMap());
        }).start();

    }
}