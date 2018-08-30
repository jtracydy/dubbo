package guava.test;

import java.util.ArrayList;
import java.util.List;

public class Demo01 {


    public static void main(String[] args) {


        List<User> list = new ArrayList<User>();
        User u1 = new User();
        u1.setAge("1");
        u1.setName("xiaoming");
        User u2 = new User();
        u2.setAge("2");
        u2.setName("xiaohong");
        User u3 = new User();
        u3.setAge("3");
        u3.setName("xiaoli");
        User u4 = new User();
        u4.setAge("4");
        u4.setName("xiaowang");
        list.add(u1);
        list.add(u2);
        list.add(u3);
        list.add(u4);
        list.forEach(user -> System.out.println(user.getName()));


    }
}
