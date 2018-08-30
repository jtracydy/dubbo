package lambda.expression;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Demo04 {

    public static void main(String[] args) {
        String[] players = {"Rafael Nadal", "Novak Djokovic",
                "Stanislas Wawrinka", "David Ferrer",
                "Roger Federer", "Andy Murray",
                "Tomas Berdych", "Juan Martin Del Potro",
                "Richard Gasquet", "John Isner"};

        List<String> list = Arrays.asList(players);
        //        Arrays.sort(players, new Comparator<String>() {
        //            @Override
        //            public int compare(String s1, String s2) {
        //                return (s1.compareTo(s2));
        //            }
        //        });

        // Comparator<String> comparator = (String s1,String s2) -> (s1.compareTo(s2));

        //Arrays.sort(players,comparator);


        //Arrays.sort(players, (String s1, String s2) -> (s1.compareTo(s2)));

        //Arrays.sort(players,(String s1,String s2) -> (s1.substring(s1.indexOf(" ")).compareTo(s2.substring(s2.indexOf(" ")))));

        //Arrays.sort(players,(String s1,String s2) -> (s1.length() - s2.length()));

        Collections.sort(list,(String s1,String s2) -> (s1.length() - s2.length()));

        list.forEach(System.out::println);


//        String str = "Rafael Nadal";
//        System.out.println(str.indexOf(" "));
//        System.out.println(str.substring(str.indexOf(" ")));
    }
}
