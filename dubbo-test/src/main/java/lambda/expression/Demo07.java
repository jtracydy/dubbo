package lambda.expression;

import java.util.UUID;

public class Demo07 {


    public static void main(String[] args) {
        TestInterface t = new TestInterface() {
            @Override
            public void get() {

            }
        };
        TestInterface t1 = () -> System.out.println("hello");

        TestInterface2 t2 = new TestInterface2() {

            @Override
            public void get() {

            }

            @Override
            public void set() {

            }
        };

        /**
         * consumer sout
         */
        TestInterface3 t3 = name -> System.out.println(name);
        t3.get("123");

        /**
         * function return String
         */
        TestInterface4 t4  = name -> name.toUpperCase();
        System.out.println(t4.get("adfadf"));

        /**
         * Predicate true or false
         */
        TestInterface5 t5 = name -> name.startsWith("s");
        System.out.println(t5.get("ssss"));

        /**
         *supplier return result
         */
        TestInterface6 t6 = () -> UUID.randomUUID().toString();
        System.out.println(t6.get());
    }
}
