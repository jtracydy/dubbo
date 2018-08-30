package lambda.stream;


import com.google.common.collect.Lists;

import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * ::使用
 */
public class Demo03 {

    public static void main(String[] args) {

        List<Person> list = Lists.newArrayList(
                new Person("xiaoming",3),
                new Person("xiaohong",11),
                new Person("xiaoli",8)
        );

        list.forEach(str -> System.out.print(str.getName()+" ") );
//        Person [] p =list.stream()
//                .filter(p -> p.getAge() > 3)
//                .toArray(Person::new);
        Function function =  Person::sum;
        list.forEach(x -> function.apply(x));
        System.out.println();
        Supplier supplier = Person::sum;
        System.out.println(supplier.get());
    }


}
