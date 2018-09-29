package guava.immutable;


import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.UnmodifiableIterator;
import lambda.bifunction.User;

import java.util.List;

/**
 * imtableMap
 */
public class Demo02 {


    public static void main(String[] args) {

        User u1 = new User();
        u1.setId(11);
        User u2 = new User();
        u2.setId(22);
        User u3 = new User();
        u3.setId(33);
        List<User> list = Lists.newArrayList(u1, u2, u3);

        ImmutableMap<Integer,User> immutableMap = Maps.uniqueIndex(list,User::getId);
        UnmodifiableIterator<Integer> iterator=  immutableMap.keySet().iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println(immutableMap);
    }
}
