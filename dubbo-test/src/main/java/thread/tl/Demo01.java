/*
*  2019 
*/
package thread.tl;

/**
 * @author wangdan Date: 2019/9/9 Time: 08:38
 * @version $Id$
 */
public class Demo01 {

    private static ThreadLocal<String> threadLocal = ThreadLocal.withInitial(()->Thread.currentThread().getName());

    public static void set(String str){
        threadLocal.set(Thread.currentThread().getName()+str);
    }

    public static String get(){
        return threadLocal.get();
    }

}