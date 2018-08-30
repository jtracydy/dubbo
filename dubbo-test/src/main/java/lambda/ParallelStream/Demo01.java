package lambda.ParallelStream;

import java.util.Arrays;
import java.util.List;

import static java.lang.System.out;

public class Demo01 {


    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        numbers.parallelStream()
                .forEach(out::println);
    }
}
