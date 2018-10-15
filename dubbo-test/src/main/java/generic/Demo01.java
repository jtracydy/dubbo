package generic;

import com.google.common.collect.Lists;

import java.util.List;

public class Demo01 {


    public static void main(String[] args) {
        List<String> sl = Lists.newArrayList();

        List<Integer> il = Lists.newArrayList();

        System.out.println(sl.getClass().equals(il.getClass()));
    }
}

/**
 * 泛型是在类的后面定义的
 * @param <T>
 */
class Generic01<T> implements Generic02<T>{

}

interface Generic02<T>{

}