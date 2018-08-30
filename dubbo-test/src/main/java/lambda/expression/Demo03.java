package lambda.expression;

import java.util.Arrays;
import java.util.List;

public class Demo03 {

    public static void main(String[] args) {
        String[] atp = {"Rafael Nadal", "Novak Djokovic",
                "Stanislas Wawrinka",
                "David Ferrer","Roger Federer",
                "Andy Murray","Tomas Berdych",
                "Juan Martin Del Potro"};
        List<String> players =  Arrays.asList(atp);

        players.forEach((player) ->{
            System.out.println(player);
        });

        players.forEach(System.out::println);


        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("thread .start....");
            }
        });

        new Thread(() -> System.out.println("hello world")).start();



        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("12313");
            }
        };


    }

    public  static void sout(Object name){

    }
}
