package test;


import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.google.common.collect.Maps;

import java.util.Map;

/**
 * Test biMap
 */
public class Demo15 {

    public static void main(String[] args) {
        BiMap<String,String> map = HashBiMap.create();
        map.put("1","a");
        map.put("2","b");
        map.put("2","c");
        map.put("4","d");
        /**
         * key相同 后面的key覆盖前面的值 value 不能相同，要求value是唯一的
         */
        //map.put("5","d");
        System.out.println(map.get("d"));

        Map<String,String> mapHash = Maps.newHashMap();
        mapHash.put("1","a");
        mapHash.put("2","b");
        mapHash.put("2","c");
        System.out.println(mapHash.get("2"));
    }
}
