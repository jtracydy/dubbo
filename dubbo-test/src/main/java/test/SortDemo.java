/*
*  2019 
*/
package test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class SortDemo {

    public static void main(String[] args) {
        System.out.println("---------------- 默认 排序结果-----------------");
        createDefaultSortTreeMap();
        System.out.println("---------------- 自定义 排序结果-----------------");
        createDefinitionSortTreeMap();


        TreeMap<Integer,String> treeMap = new TreeMap<>();
        treeMap.put(9,"");
        treeMap.put(6,"");
        treeMap.put(7,"");
        treeMap.put(1,"");
        treeMap.put(8,"");
        treeMap.put(2222,"");
        treeMap.put(2,"");
        treeMap.put(99,"");
        System.out.println(treeMap);
    }

    public static void createDefaultSortTreeMap() {
        TreeMap<String, String> map = new TreeMap<>();

        init(map);
        print(map);
    }

    public static void createDefinitionSortTreeMap() {

        TreeMap<String, String> map = new TreeMap<>(Comparator.reverseOrder());

        init(map);
        print(map);
    }

    public static void init(Map<String, String> map) {
        map.put("1", "1");
        map.put("3", "1");
        map.put("5", "1");
        map.put("888", "1");
        map.put("2", "1");
        map.put("8", "1");
        map.put("4", "1");
        map.put("88888", "1");
        map.put("111", "1");
        map.put("555", "1");
    }

    public static void print(Map<String, String> map) {
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> entry = it.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}