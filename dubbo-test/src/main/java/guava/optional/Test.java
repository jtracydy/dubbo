package guava.optional;

import com.google.common.base.Optional;

public class Test {

    public static void main(String[] args) {

        String a = null;
        String b = new String("b");
        String c = new String("b");
        Optional<String> at = Optional.fromNullable(a);
        Optional<String> bt = Optional.of(b);
        Optional<String> ct = Optional.of(c);
        System.out.println("asSet"+" "+at.asSet()+" "+bt.asSet());

        System.out.println("equal"+" "+at.equals(bt));
        System.out.println("equal"+" "+ct.equals(bt));


        System.out.println("get"+" "+ct.get());

        System.out.println("or"+" "+ct.or("a"));
        System.out.println("or"+" "+at.or("a"));

        System.out.println(""+" ");

    }
}
