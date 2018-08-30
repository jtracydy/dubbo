package guava.multiset;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;

public class Demo01 {

    public static void main(String[] args) {
        String[] str = new String[]{"1", "2", "1", "2", "1", "2", "1", "2", "3", "4"};

        Multiset<String> set = HashMultiset.create();
        for (int i = 0; i < str.length; i++) {
            set.add(str[i]);
        }

        for (Multiset.Entry<String> entry:set.entrySet()){
            System.out.println(entry.getElement()+" "+set.count(entry.getElement()));
        }
        System.out.println(set.count("1"));



    }
}
