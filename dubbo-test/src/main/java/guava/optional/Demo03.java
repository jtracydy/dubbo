package guava.optional;

import com.google.common.collect.Collections2;
import com.google.common.collect.Sets;

import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.HashSet;

/**
 *
 * predicate 返回结果true or false
 * function 有输入 又返回结果
 * consumer  有输入 无返回结果
 * supplier 无输入 又返回结果
 * */
public class Demo03 {

    public static void main(String[] args) {
        HashSet<Long> set = Sets.newHashSet();
        set.add(20000000000000L);
        set.add(30000000000000L);
        set.add(40000000000000L);

        Collection<String> result2 = Collections2.transform(set,
                input -> new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(input).toString());

        result2.forEach(System.out::println);
    }
}
