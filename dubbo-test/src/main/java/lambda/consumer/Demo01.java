package lambda.consumer;

import lambda.bifunction.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

public class Demo01 {

    List<User> users = new ArrayList<>();

    public static void main(String[] args) {

        Demo01 d = new Demo01();

        User u = new User();
        u.setId(11);
        User u1 = new User();
        u1.setId(22);
        User u2 = new User();
        u2.setId(33);
        d.users.add(u);
        d.users.add(u1);
        d.users.add(u2);


        System.out.println(d.users);

        List<Integer> integers = new ArrayList<>();


        d.get(o -> o.stream()
                .filter(Objects::nonNull)
                .map(user -> user.getId())
                .forEach(integers::add));

        System.out.println(integers);

    }

    public void get(Consumer<List<User>> consumer) {
        /**
         * 参数赋值
         */
        consumer.accept(users);
    }
    /**
     *
     */
}
