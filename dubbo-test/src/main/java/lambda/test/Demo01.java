package lambda.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Demo01 {


    public static void main(String[] args) {
        List<String> names = Arrays.asList("shekhar", "rahul", "sameer");

        Collections.sort(names, Comparator.comparing(String::length));


        Collections.sort(names, new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                if(o1.length() - o2.length() >0){
                    return 1;
                }

                return 0;
            }
        });
        /**
         * lambda表达式相当于传递参数 箭头后边的是函数行为
         */
        Collections.sort(names,(c1,c2) -> c1.length()-c2.length());
    }
}
