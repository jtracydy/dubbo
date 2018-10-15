package test;


import com.google.common.collect.Lists;
import common.User;

import java.util.List;
import java.util.stream.Collectors;

public class Demo18 {


    public static void main(String[] args) {

        User u1 = new User();
        u1.setName("xiaoming");
        u1.setAge(22);
        User u2 = new User();
        u2.setName("xiaoming");
        u2.setAge(33);
        User u3 = new User();
        u3.setName("xiaoming");
        u3.setAge(15);

        List<User> userList = Lists.newArrayList(u1,u2,u3);

        List<Integer> integerList = userList.stream().map(User::getAge).collect(Collectors.toList());
        System.out.println(integerList);
    }
}
