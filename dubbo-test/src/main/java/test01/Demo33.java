/*
*  2019 
*/
package test01;

import com.google.common.collect.Lists;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author wangdan Date: 2019/9/21 Time: 11:45
 * @version $Id$
 */
public class Demo33 {


    public static void main(String[] args) {
        List<String> list = (Lists.newArrayList());
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");

        for (String str:list){
            System.out.println(str);
        }

        Set<String> set = new HashSet<>();
        set.add("1");
        set.remove(0);
        System.out.println(set);


        Vector<String> vector = new Vector<>();

        ConcurrentHashMap<String,String> map = new ConcurrentHashMap<>();
        map.put("1","1");
        map.put("2","2");
        map.put("3","3");
        map.put("4","4");

        System.out.println(map);
        map.size();

        CopyOnWriteArrayList<String> arrayList = new CopyOnWriteArrayList<>();
        arrayList.add("1");


        int array [] = {1,2,3,4,5,6};
        int []  copy = Arrays.copyOf(array,array.length);
        System.out.println(array);
        System.out.println(copy);

        System.out.println(Arrays.toString(copy));

        Queue<String> queue = new ArrayDeque<>();
    }
}