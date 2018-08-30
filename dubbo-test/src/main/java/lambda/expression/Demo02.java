package lambda.expression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo02 {


    public static void main(String[] args) {
        List<String> list =  Arrays.asList("shekhar", "rahul", "sameer");
        list.forEach(System.out::println);

        List<User> userList = new ArrayList<>();
        User u1 = new User();
        u1.setAge("11");
        u1.setName("xiaoming");
        userList.add(u1);
        User u2 = new User();
        u2.setAge("11");
        u2.setName("xiaoli");
        userList.add(u2);
        User u3 = new User();
        u3.setAge("11");
        u3.setName("xiaozhang");
        userList.add(u3);
        User u4 = new User();
        u4.setAge("12");
        u4.setName("xiaosun");
        userList.add(u4);
        User u5 = new User();
        u5.setAge("12");
        u5.setName("xiaofeng");
        userList.add(u5);

      //  System.out::println(() -> 5);


    }

}
