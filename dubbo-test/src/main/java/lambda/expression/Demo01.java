package lambda.expression;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

public class Demo01 {


    public static void main(String[] args) {
        List<String> names = Arrays.asList("shekhar", "rahul", "sameer");

        Collections.sort(names,(first,second) ->(first.hashCode() - second.hashCode()));

        names.forEach(System.out::println);


        Function<String, Integer> strToLength = str -> str.length();

        String str = "adfadfaf";
        //System.out.println(str::toLowerCase);


    }
}
