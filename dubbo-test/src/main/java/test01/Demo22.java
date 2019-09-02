/*
*  2019 
*/
package test01;


import com.google.common.collect.Lists;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * @author wangdan Date: 2019/8/21 Time: 19:57
 * @version $Id$
 */
public class Demo22 {

    public static void main(String[] args) {

//        arrayDeque();

        try {
            f();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    private static void f() throws InterruptedException {
        ArrayBlockingQueue<String> arrayBlockingQueue = new ArrayBlockingQueue<>(3);

//        String str  =arrayBlockingQueue.poll(20, TimeUnit.MICROSECONDS);
//        System.out.println(str);
        arrayBlockingQueue.offer("222");
        arrayBlockingQueue.offer("333");
        arrayBlockingQueue.offer("111");
//        arrayBlockingQueue.offer("3333",111,TimeUnit.MICROSECONDS);
//        arrayBlockingQueue.add("111");
//        arrayBlockingQueue.put("3333333");
//        arrayBlockingQueue.take();
//        arrayBlockingQueue.poll();
//        arrayBlockingQueue.poll(111,TimeUnit.MICROSECONDS);
//        arrayBlockingQueue.remove();
//        System.out.println(arrayBlockingQueue);
//        arrayBlockingQueue.remove("333");
//        System.out.println(arrayBlockingQueue);
        Iterator<String> itr = arrayBlockingQueue.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }


    private static void arrayDeque() {
        ArrayDeque<String> arrayDeque = new ArrayDeque<>(10);
        arrayDeque.add("1");
        arrayDeque.add("2");
        arrayDeque.add("3");
        arrayDeque.add("4");
        System.out.println("add " + arrayDeque);

        arrayDeque.offer("55");
        System.out.println("offer " + arrayDeque);

        arrayDeque.push("333");
        System.out.println("push " + arrayDeque);


        arrayDeque.addFirst("10");
        System.out.println("addFirst " + arrayDeque);

        System.out.println("element " + arrayDeque.element());
        System.out.println("peek " + arrayDeque.peek());

        System.out.println("poll " + arrayDeque.poll());
        System.out.println("poll " + arrayDeque);
        System.out.println("pop " + arrayDeque.pop());
        System.out.println("pop " + arrayDeque);


    }

    private static void linkedList() {
        LinkedList<String> queue = new LinkedList<>();
    }

    private static void fff() {
        LinkedBlockingDeque<String> linkedBlockingDeque = new LinkedBlockingDeque<>();

    }

    private static void fffff() {
        PriorityBlockingQueue<String> priorityBlockingQueue = new PriorityBlockingQueue<>();
    }
}