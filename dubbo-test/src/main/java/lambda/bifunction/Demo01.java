package lambda.bifunction;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Demo01 {

    public static void main(String[] args) {
        System.out.println(getSum(1, 2, (a, b) -> a + b));
        System.out.println(getSum(1, 2, (a, b) -> a - b));
        System.out.println(getSum(1, 2, (a, b) -> a * b));
        System.out.println(getSum(2, 2, (a, b) -> a / b));


        System.out.println(getFunction(3, (a) -> a * a));



        Demo01 d  = new Demo01();
        d.getSumDemo(1, 1, new BiFunction<Integer, Integer, Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return null;
            }
        });


    }


    public static Integer getSum(Integer a, Integer b, BiFunction<Integer, Integer, Integer> biFunction) {

        return biFunction.apply(a, b);
    }

    public Integer getSumDemo(Integer a, Integer b, BiFunction<Integer, Integer, Integer> biFunction) {

        return null;
    }


    public static Integer getFunction(Integer i, Function<Integer, Integer> function) {
        return function.apply(i);
    }


    private static List<Integer> getList(Integer from, Integer end) {

        List<Integer> list = new ArrayList<>();
        for (int i = from; i < end; i++) {
            list.add(i);
        }
        return list;
    }


}
