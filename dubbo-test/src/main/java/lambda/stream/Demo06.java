package lambda.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo06 {
    
    public static void main(String[] args) {

        /**
         * map方法是一个function方法 有输入有输出的方法，将map处理后结果存放到stream中
         */
        List<Integer> nums = Arrays.asList(1, 2, 3, 4);
        List<Integer> squareNums = nums.stream().map(n ->n * n).collect(Collectors.toList());
        squareNums.forEach(System.out::println);
    }
}
