package lambda.bifunction;

import java.util.UUID;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Blog01 {


    public static void main(String[] args) {

        /**
         * 行为表示方式
         */
        new Thread(new Runnable() {
            @Override
            public void run() {

            }
        });

        new Thread(new RunImpl());

        /**
         * 函数接口
         */

        Predicate<String> namesStartingWithS = name -> name.startsWith("s");

        Consumer<String> messageConsumer = message -> System.out.println(message);

        Function<String, String> toUpperCase = name -> name.toUpperCase();

        Supplier<String> uuidGenerator= () -> UUID.randomUUID().toString();


        /**
         * 方法调用
         */
        System.out.println(getStr("x","y",new BiFuntionImpl<>()));

        getStr("x", "y", new BiFunction<String, String, String>() {
            @Override
            public String apply(String s, String s2) {
                return s.concat(s2);
            }
        });

        getStr("x","y",(a,b) -> a.concat(b));




    }

    /**
     *  函数式表达式的接口定义其目的就是实现传参时的行为， 次方法参数的行为就是a.concat(b)
     * @param a
     * @param b
     * @param biFunction
     * @return
     */
    public static String getStr(String a,String b,BiFunction<String,String,String> biFunction){
        return biFunction.apply(a,b);
    }

}

class RunImpl implements Runnable{

    @Override
    public void run() {

    }
}