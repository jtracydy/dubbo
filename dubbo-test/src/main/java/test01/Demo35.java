/*
*  2019 
*/
package test01;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.CyclicBarrier;

/**
 * @author wangdan Date: 2019/9/22 Time: 09:36
 * @version $Id$
 */
public class Demo35 {

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        Deque<String> deque = new ArrayDeque<>();
        deque.add("1");
        deque.add("2");
        deque.add("3");

        System.out.println(deque);
        deque.addLast("4");
        System.out.println(deque);
        deque.addFirst("5");
        System.out.println(deque);


        CyclicBarrier barrier  = new CyclicBarrier(5);
    }
}