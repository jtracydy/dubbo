/*
*  2019 
*/
package test01;

import java.util.Vector;

/**
 * @author wangdan Date: 2019/8/22 Time: 11:22
 * @version $Id$
 */
public class Demo24 {

    static Vector<Integer> vector = new Vector<Integer>();

    public static void main(String[] args) throws InterruptedException {
        while (true) {
            for (int i = 0; i < 10; i++)
                vector.add(i);
            Thread thread1 = new Thread() {
                public void run() {
                    for (int i = 0; i < vector.size(); i++)
                        vector.remove(i);
                }

                ;
            };
            Thread thread2 = new Thread() {
                public void run() {
                    for (int i = 0; i < vector.size(); i++){
                        vector.get(i);
                    }
                }
            };
            thread1.start();
            thread2.start();
            while (Thread.activeCount() > 10) {

            }
        }
    }
}