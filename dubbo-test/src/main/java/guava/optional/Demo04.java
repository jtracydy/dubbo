package guava.optional;

import com.google.common.base.Optional;

import java.util.Arrays;
import java.util.List;

public class Demo04 {


    public static void main(String[] args) {
        User u1 = new User();
        u1.setAge("132");
        u1.setName("lucas");
        User u2 = new User();
        u2.setAge("");
        u2.setName(null);

        List<User> list = Arrays.asList(u1,u2);

        for (User u: list){
            Optional<String> oa =  Optional.fromNullable(u.getAge());
            Optional<String> ou =  Optional.fromNullable(u.getName());

            if(oa.isPresent()){
                System.out.println(oa.get());
            }

            if(ou.isPresent()){
                System.out.println(ou.get());
            }
            System.out.println("....");
        }
        //list.forEach(user -> System.out.println(user.getAge().toString()+" "+user.getName().toString()));
    }
}
