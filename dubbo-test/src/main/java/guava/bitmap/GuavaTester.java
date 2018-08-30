package guava.bitmap;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

public class GuavaTester {

    /**
     * 特殊的映射关系，同时确保键值的唯一性，可以通过key get value 也可以通过value get值
     * @param args
     */
    public static void main(String args[]){
        BiMap<Integer, String> empIDNameMap = HashBiMap.create();

        empIDNameMap.put(new Integer(101), "Mahesh");
        empIDNameMap.put(new Integer(102), "Sohan");
        empIDNameMap.put(new Integer(103), "Ramesh");

        System.out.println(empIDNameMap);
        //Emp Id of Employee "Mahesh"
        System.out.println(empIDNameMap.inverse().get("Mahesh"));

        empIDNameMap.forcePut(new Integer(101), "lucas");
        empIDNameMap.forcePut(new Integer(104), "lucas1");
        System.out.println(empIDNameMap);
    }
}