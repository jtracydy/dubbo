/*
*  2019 
*/
package test01;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author wangdan Date: 2019/5/11 Time: 11:31
 * @version $Id$
 */
public class Demo02 {

    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger();
        atomicInteger.decrementAndGet();
    }
}
