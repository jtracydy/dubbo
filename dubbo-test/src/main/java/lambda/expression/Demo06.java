package lambda.expression;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toCollection;
import static java.util.stream.Collectors.toMap;
import static java.util.stream.Collectors.toSet;


public class Demo06 {

    public static void main(String[] args) {
        List<Person> javaProgrammers = new ArrayList<Person>() {
            {
                add(new Person("Elsdon", "Jaycob", "Java programmer", "male", 43, 2000));
                add(new Person("Tamsen", "Brittany", "Java programmer", "female", 23, 1500));
                add(new Person("Floyd", "Donny", "Java programmer", "male", 33, 1800));
                add(new Person("Sindy", "Jonie", "Java programmer", "female", 32, 1600));
                add(new Person("Vere", "Hervey", "Java programmer", "male", 22, 1200));
                add(new Person("Maude", "Jaimie", "Java programmer", "female", 27, 1900));
                add(new Person("Shawn", "Randall", "Java programmer", "male", 30, 2300));
                add(new Person("Jayden", "Corrina", "Java programmer", "female", 35, 1700));
                add(new Person("Palmer", "Dene", "Java programmer", "male", 33, 2000));
                add(new Person("Addison", "Pam", "Java programmer", "female", 34, 1300));
            }
        };

        List<Person> phpProgrammers = new ArrayList<Person>() {
            {
                add(new Person("Jarrod", "Pace", "PHP programmer", "male", 34, 1550));
                add(new Person("Clarette", "Cicely", "PHP programmer", "female", 23, 1200));
                add(new Person("Victor", "Channing", "PHP programmer", "male", 32, 1600));
                add(new Person("Tori", "Sheryl", "PHP programmer", "female", 21, 1000));
                add(new Person("Osborne", "Shad", "PHP programmer", "male", 32, 1100));
                add(new Person("Rosalind", "Layla", "PHP programmer", "female", 25, 1300));
                add(new Person("Fraser", "Hewie", "PHP programmer", "male", 36, 1100));
                add(new Person("Quinn", "Tamara", "PHP programmer", "female", 21, 1000));
                add(new Person("Alvin", "Lance", "PHP programmer", "male", 38, 1600));
                add(new Person("Evonne", "Shari", "PHP programmer", "female", 40, 1800));
            }
        };
        /**
         * foreach 输出
         */
//        phpProgrammers.forEach((stu) -> System.out.print(stu.getAge()+" "+stu.getFirstName()));
//        phpProgrammers.forEach((stu) -> System.out.printf(""));

        /**
         * foreach 赋值
         */

//        Consumer<Person> giveRaise = e -> e.setSalary(e.getSalary() * (1+1));
//        phpProgrammers.forEach(p -> System.out.print(p.getSalary()+" "));
//        System.out.println();
//        phpProgrammers.forEach(giveRaise);
//        phpProgrammers.forEach(p -> System.out.print(p.getSalary()+" "));

        /**
         * filter 过滤
         */
//        phpProgrammers.stream()
//                .filter((p) -> p.getSalary() > 1400)
//                .filter((p) -> p.getAge() > 25)
//                .filter((p) -> ("female").equals(p.getGender()))
//                .forEach((p) -> System.out.println(p.getFirstName()+" "+p.getSalary()));

        /**
         * limit
         */
//        phpProgrammers.stream()
//                .filter((p) -> ("female").equals(p.getGender()))
//                .limit(3)
//                .forEach((p) -> System.out.println(p.getFirstName()+" "+p.getSalary()));
        /**
         * sort
         */

//        List<Person> sortedJavaProgrammers  =
//                phpProgrammers
//                        .stream()
//                        .sorted((p1,p2) -> p1.getSalary() - p2.getSalary())
//                        .limit(5)
//                        .collect(toList());
//        sortedJavaProgrammers.forEach((p) -> System.out.print(p.getSalary()+" "));
//        System.out.println();
//        phpProgrammers.forEach((p) -> System.out.print(p.getSalary()+" "));
//
//        Person minPer = phpProgrammers.stream()
//                .min((p1,p2) -> (p1.getSalary()-p2.getSalary()))
//                .get();
//
//        Person maxPer = phpProgrammers.stream()
//                .max((p1,p2) -> (p1.getSalary()-p2.getSalary()))
//                .get();
//        System.out.println(minPer.getSalary()+" "+maxPer.getSalary());

        /**
         * map
         */

        String str = phpProgrammers
                .stream()
                .map(Person::getFirstName)
                .collect(joining(":"));
        System.out.println(str);

        Set<String> set = phpProgrammers
                .stream()
                .map(Person::getLastName)
                .collect(toSet());
        set.forEach((s) -> System.out.print(s+" "));


        TreeSet<String> map = javaProgrammers
                .stream()
                .map(Person::getLastName)
                .collect(toCollection(TreeSet::new));

        map.forEach(System.out::println);
    }
}
