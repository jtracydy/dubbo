package lambda.stream;


import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class MyTest {

    public static void main(String[] args) {
        List<String> a1 = Arrays.asList("a", "b", "c");

        a1.forEach(x -> MyTest.printValur(x));

        Consumer<String> str = MyTest::printValur;
        a1.forEach( x ->str.accept(x));

    }

    public static void printValur(String str) {
        System.out.println("print value : " + str);
    }
}
