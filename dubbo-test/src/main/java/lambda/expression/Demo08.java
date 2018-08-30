package lambda.expression;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Demo08 {


    public static void main(String[] args) {
        String[] players = {"Rafael Nadal", "Novak Djokovic",
                "Stanislas Wawrinka", "David Ferrer",
                "Roger Federer", "Andy Murray",
                "Tomas Berdych", "Juan Martin Del Potro",
                "Richard Gasquet", "John Isner"};

        List<String> list = Arrays.asList(players);
        //Collections.sort(list);

//        List<String> listCopy = list.stream()
//                .filter(player -> player.startsWith("s"))
//                .limit(3)
//                .collect(Collectors.toList());

        Map<Object, List<String>> listColl = list.stream()
                .collect(Collectors.groupingBy(name -> name.hashCode() ));
    }
}
