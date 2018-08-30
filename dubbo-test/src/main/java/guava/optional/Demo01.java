package guava.optional;


import com.google.common.base.Optional;

import java.util.Set;
import java.util.UUID;

/**
 * 包含非空对象的不可变对象
 * 是用null 而不是 ""
 */
public class Demo01 {

    public static void main(String[] args) {

        String str = "";
        Optional<String> option = Optional.fromNullable(str);
        if(option.isPresent()){
            System.out.println(option.get());
        }
        System.out.println("....");
        Optional<String> optional = Optional.absent();
        System.out.println(optional.isPresent());

        String asSet = "asSet";
        Optional<String> o1 = Optional.fromNullable(asSet);
        Set<String> set = o1.asSet();
        System.out.println("asSet "+set);

        String get = "get";
        Optional<String> o2 = Optional.fromNullable(get);
        System.out.println("get "+o2.get());

        System.out.println("of........");
        //String s1 = null;
        /**
         * optional of的参数不能为null
         */

        String s2 = "of";
        //Optional<String> p3 = Optional.of(s1);
        Optional<String> p4 = Optional.of(s2);

        if(p4.isPresent()){
            System.out.println(p4.get());
        }

        System.out.println("or....");
        String s3 = "ororororo";
        String s4  = "or";
        Optional p5 = Optional.fromNullable(s3);
        Optional p6 = Optional.fromNullable(s4);

        Optional p7 = p5.or(p6);
        System.out.println("or "+p7.isPresent());
        System.out.println("or "+p7.get());

        String ss  =  null;
        Optional pp = Optional.fromNullable(ss);
        System.out.println("or supplier "+pp.or(() -> UUID.randomUUID()));
        System.out.println(pp.or("abc"));


        System.out.println();
        System.out.println("notnull....");
        String s5 = "123123";
        Optional<String> p8 = Optional.fromNullable(s5);
        System.out.println(p8.orNull());


    }
}
