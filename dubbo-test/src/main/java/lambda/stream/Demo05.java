package lambda.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo05 {




    public static void main(String[] args) {
        /**
         * Stream 转换成其他的结构
         */
        List<String> list = Stream.of("one", "two", "three", "four").collect(Collectors.toList());
        list.stream().map(String::toUpperCase)
                .collect(Collectors.toList())
                .forEach((str) -> System.out.print(str+ " "));
    }
}
