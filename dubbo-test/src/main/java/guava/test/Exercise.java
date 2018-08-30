package guava.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise {

    public static void main(String args[]) {
        List<String> lines = Arrays.asList("spring", "node", "mkyong");
        List<String> result0 = getFilterOutput(lines, "mkyong");
        // output "spring", "node"
//        for (String temp : result0) {
//            System.out.println(temp);
//        }

        List<String> result1 = lines.stream()  // convert list to stream
                .filter(line -> !"mkyong".equals(line)) // filter the line which equals to "mkyong"
                .collect(Collectors.toList());  // collect the output and convert streams to a list

        result1.forEach(System.out::println); // output "spring", "node"
    }

    private static List<String> getFilterOutput(List<String> lines, String filter) {
        List<String> result = new ArrayList<>();
        for (String line : lines) {
            if (!"mkyong".equals(line)) {
                result.add(line);
            }
        }
        return result;
    }

}