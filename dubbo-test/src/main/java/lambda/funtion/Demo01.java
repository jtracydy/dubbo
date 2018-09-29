package lambda.funtion;

import java.util.function.Function;

public class Demo01 {

    public static void main(String[] args) {
        System.out.println(stuApply(3, (a) -> a * a));
        System.out.println(stuApply(4, (a) -> a + a));
        System.out.println(stuCompose(5, (a) -> a + a));
        System.out.println(stuCompose(5, (a) -> a * a));
        System.out.println(stuAndThen(5, (a) -> a + a));
        System.out.println(stuAndThen(5, (a) -> a * a));

    }

    /**
     * function就是一个表达式
     *
     * @param f
     * @param function
     * @return
     */
    public static Integer stuApply(int f, Function<Integer, Integer> function) {
        return function.apply(f);
    }

    public static Integer stuCompose(int f, Function<Integer, Integer> function) {

        Function<Integer, Integer> temp = function.compose(function);

        return temp.apply(f);
    }

    public static Integer stuAndThen(int f, Function<Integer, Integer> function) {

        Function<Integer, Integer> temp = function.andThen(function);

        return temp.apply(f);
    }


}
