/*
*  2019 
*/
package test01;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * @author wangdan Date: 2019/8/16 Time: 10:43
 * @version $Id$
 */
public class Demo21 {

    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>(Comparator.naturalOrder());
        treeMap.put(1, "1");
        treeMap.put(10, "10");
        treeMap.put(7, "7");
        treeMap.put(3, "3");
        treeMap.put(2, "2");
        treeMap.put(9, "9");

        System.out.println(treeMap);
    }
}