package guava.test;

import java.util.UUID;
import java.util.stream.Stream;

public class Demo02 {


    public static void main(String[] args) {
        Stream<String> uuidStream = Stream.generate(() -> UUID.randomUUID().toString());
        uuidStream.forEach(System.out::println);
    }
}
