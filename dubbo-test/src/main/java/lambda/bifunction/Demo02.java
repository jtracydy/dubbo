package lambda.bifunction;

import com.google.common.collect.Lists;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.function.BiFunction;

public class Demo02 {



    public static void main(String[] args) {
        User u1 = new User();
        u1.setId(1);
        u1.setAge("111");
        u1.setName("lucas");

        User u2 = new User();
        u2.setId(2);
        u2.setAge("222");
        u2.setName("tracy");

        User u3 = new User();
        u3.setId(3);
        u3.setAge("333");
        u3.setName("danlucas");

        List<User> users = Lists.newArrayList(u1,u2,u3);

        getSet((start,end) -> users);
    }


    private static Set<Integer> getSet(BiFunction<Integer, Integer, Collection<User>> biFunction) {

        Integer start = 1;
        Integer end = 3;

        List<User> list = (List)biFunction.apply(start,end);
        list.forEach(u -> System.out.println(u.getId()+" "+u.getAge()+" "+u.getName()));

        return null;
    }


}
