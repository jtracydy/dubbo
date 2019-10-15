/*
*  2019 
*/
package thread.tl;

/**
 * @author wangdan Date: 2019/9/9 Time: 08:42
 * @version $Id$
 */
public class Demo02 {

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            System.out.println("t1=" + Demo01.get());
        });
        t1.start();

        Thread t2 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName()+" "+Demo01.get());
            Demo01.set(" set value");
            System.out.println(Thread.currentThread().getName()+" "+Demo01.get());
        });
        t2.start();

        System.out.println("thread .............");
        System.out.println(t1.getName());
        System.out.println(t2.getName());
        System.out.println(Thread.currentThread().getName());

        System.out.println("thread .........end");
    }
}