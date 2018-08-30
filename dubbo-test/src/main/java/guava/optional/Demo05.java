package guava.optional;

import java.util.Optional;

public class Demo05 {

    public static void main(String[] args) {
        String str = null;
        Optional<String> optional = Optional.ofNullable(str);
        if (optional.isPresent()) {
            System.out.println(".........");
        } else {
            System.out.println("null");
        }
    }
}
