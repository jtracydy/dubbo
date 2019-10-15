/*
*  2019 
*/
package test01;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author wangdan Date: 2019/8/15 Time: 20:03
 * @version $Id$
 */
public class Demo20 {


    public static void main(String[] args) {
        ConcurrentHashMap<String,String> concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.put("1","1");


        System.out.println(0x7fffffff);

        concurrentHashMap.get("");
        concurrentHashMap.putIfAbsent("","");
    }
}