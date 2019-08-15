/*
*  2019 
*/
package test01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * @author wangdan Date: 2019/8/7 Time: 11:04
 * @version $Id$
 */
public class Demo18 {


    public static void main(String[] args) {
        Map<String, String> map = new HashMap();
        map.put("1", "1");
        map.put("2", "2");
        map.put("3", "2");
        map.put("4", "2");
        map.put("5", "6");
        map.put("6", "6");
        map.put("7", "6");
        map.put("8", "6");
        map.put("9", "6");
        map.put("10", "6");
        map.put("11", "6");
        map.put("12", "6");
        map.put("13", "6");
        map.put("14", "6");
        map.put("15", "6");
        map.put("16", "6");
        map.get("16");


        ArrayList<String> list = new ArrayList<>(10);
        list.add("1111");
        System.out.println(list);
        list.get(0);
        list.remove(0);

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("1");


    }
}