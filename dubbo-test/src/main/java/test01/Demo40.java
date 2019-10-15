/*
*  2019 
*/
package test01;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author wangdan Date: 2019/10/6 Time: 09:42
 * @version $Id$
 */
public class Demo40 {

    public static void main(String[] args) {
        System.out.println(Integer.SIZE);
        System.out.println(Integer.toBinaryString((1 << 29) - 1));

        System.out.println(Integer.toBinaryString((-1 << 29)));
        AtomicInteger ctl = new AtomicInteger((-1 << 29) | 0);

        System.out.println(Integer.toBinaryString(ctl.get()));

        BlockingQueue<String> queue = new ArrayBlockingQueue<>(10);
        BlockingQueue<String> blockingQueue = new LinkedBlockingQueue<>();
    }
}