/*
*  2019 
*/
package test01;

import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author wangdan Date: 2019/9/21 Time: 14:56
 * @version $Id$
 */
public class Demo34 {

    public static void main(String[] args) throws Exception {
        CopyOnWriteArrayList<String> arrayList = new CopyOnWriteArrayList<>();
        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");
        arrayList.add("4");

        new Thread(()->{
            System.out.println(arrayList);
        }).start();

        new Thread(()->{
            arrayList.add("5");
            System.out.println(arrayList);
        }).start();

        new Thread(()->{
            System.out.println(arrayList);
        }).start();
    }
}