package lambda.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo02 {


    public static void main(String[] args) {

        /**
         * skip
         */

        Stream.of("one", "two", "three", "four")
                .skip(5)
                .collect(Collectors.toList()).forEach(System.out::println);


        /**
         * sorted 默认调用的调用comparator方法
         * forEachOrdered 串行处理输出
         */
        Stream.of("nine","ten","one", "two", "three", "four")
                .sorted((str1,str2) -> str1.hashCode() - str2.hashCode())
                .forEachOrdered((str) -> System.out.print(str+" "));
                //.collect(Collectors.toList()).forEach(System.out::println);

        Stream.of("nine","ten","one", "two", "three", "four")
                .sorted((str1,str2) -> str1.hashCode() - str2.hashCode())
                .forEach(System.out::println);

        /**
         * toArray
         */
        // Object  []  str = Stream.of("nine","ten","one", "two", "three", "four").toArray();
        System.out.println();
        System.out.println("toarray.........");
        List<String> strs = Arrays.asList("a", "b", "c");
        strs.forEach(str ->System.out.print(str+" "));
        System.out.println();

        String[] dd = strs.stream()
                .skip(1)
                .toArray(str -> new String[strs.size()]);
        Stream.of(dd).forEach(str ->System.out.print(str+" "));
        System.out.println();
        strs.forEach(str ->System.out.print(str+" "));
        System.out.println();

        String[] dd1 = strs.stream()
                .skip(1)
                .toArray(String[]::new);
        Stream.of(dd1).forEach(str ->System.out.print(str+" "));

    }
}
