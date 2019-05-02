/*
*  2019 
*/
package test;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author wangdan Date: 2019/3/29 Time: 15:47
 * @version $Id$
 */
public class Demo61 {

    public static void main(String[] args) {
        TreeMap<String,String> treeMap = new TreeMap<>();
        treeMap.put("b","2");
        treeMap.put("a","1");
        treeMap.put("c","3");
        treeMap.put("d","4");
        treeMap.put("e","5");

        System.out.println(treeMap);

        Map<String,String> map = new HashMap<>();
        map.put("baaa","2");
        map.put("aaa","1");
        map.put("caa","3");
        map.put("dsss","4");
        map.put("eddd","5");
        System.out.println(map);
    }
}