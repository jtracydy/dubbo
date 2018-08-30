package guava.multimap;


import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;

import java.util.Collection;
import java.util.Map;

public class Demo01 {


    public static void main(String[] args) {

        Multimap<String, String> map = HashMultimap.create();
        map.put("a", "a");
        map.put("a", "b");
        map.put("a", "c");
        map.put("b", "a");
        map.put("c", "a");
        map.put("d", "a");
        map.put("e", "a");
        map.put("f", "a");

        System.out.println(map.get("a"));

        Map<String, Collection<String>> m = map.asMap();
        for (Map.Entry<String, Collection<String>> c : m.entrySet()) {
            System.out.println(c.getKey()+" "+c.getValue());
        }
    }
}
