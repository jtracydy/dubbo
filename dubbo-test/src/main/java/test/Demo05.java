package test;

import java.util.ArrayList;
import java.util.List;

public class Demo05 {


    public static void main(String[] args) {
        List<Integer> list = new ArrayList();
        list.add(9);
        list.add(9);
        list.add(9);
        list.add(9);
        list.add(3);
        list.add(2);
        list.add(4);
        list.add(6);


        list.stream().sorted().forEach(System.out::print);
    }
}
