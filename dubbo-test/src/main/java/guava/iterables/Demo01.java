package guava.iterables;

import com.google.common.collect.Iterables;
import com.google.common.collect.Sets;

import java.util.Set;

public class Demo01 {

    public static void main(String[] args) {
        Set<Integer> set1 = Sets.newHashSet(1, 2, 3, 4);
        Set<Integer> set2 = Sets.newHashSet(5, 6, 7, 8);

        System.out.println(Iterables.contains(set1,set2));


        System.out.println(Iterables.partition(set1,3));
    }
}
