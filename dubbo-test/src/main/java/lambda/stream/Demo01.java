package lambda.stream;

import com.google.common.collect.Lists;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo01 {

    public static void main(String[] args) {
        /**
         * 构造stream
         */

        Stream stream = Stream.of(new String[]{"a", "b", "c"});
        System.out.println(stream.findFirst().get());

        stream = Stream.of("e", "f", "g");
        stream.forEach(System.out::println);

      String  [] str = new String[]{"h","i"};
        stream  = Stream.of(str);
        stream = Arrays.stream(str);

        stream = Lists.newArrayList(str).stream();
        stream.forEach(System.out::println);



        Stream.of("one", "two", "three", "four")
                        .filter(e -> e.length() > 2)
                         .peek(e -> System.out.println("Filtered value: " + e))
                         .map(String::toUpperCase)
                         .peek(e -> System.out.println("Mapped value: " + e))
                         .collect(Collectors.toList());

    }
}
