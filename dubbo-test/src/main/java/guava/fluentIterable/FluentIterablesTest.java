package guava.fluentIterable;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import org.junit.Before;
import org.junit.Test;

import java.util.Collection;

public class FluentIterablesTest {
    private Person person1;
    private Person person2;
    private Person person3;
    private Person person4;
    private Person person5;
    private Person person6;
    Collection<Person> personList;

    @Before
    public void setUp() {
        person1 = new Person("Wilma", "Flintstone", 30, "F");
        person2 = new Person("Fred", "Flintstone", 32, "M");
        person3 = new Person("Betty", "Rubble", 31, "F");
        person4 = new Person("Barney", "Rubble", 33, "M");
        person5 = new Person("Barney", "Rubble", 33, "M");
        person6 = new Person("Barney", "Rubble", 33, "M");
        personList = Lists.newArrayList(person1, person2, person3, person4, person5, person6);
    }

    @Test
    public void testFilter() throws Exception {

        Iterable<Person> personsFilteredByAge = FluentIterable.from(personList).filter(new Predicate<Person>() {
            @Override
            public boolean apply(Person input) {
                return input.getAge() > 31;
            }
        });

        System.out.println(Iterables.contains(personsFilteredByAge, person2));
        System.out.println(Iterables.contains(personsFilteredByAge, person4));
        System.out.println(Iterables.contains(personsFilteredByAge, person5));
        System.out.println(Iterables.contains(personsFilteredByAge, person6));
        System.out.println(Iterables.contains(personsFilteredByAge, person1));
        System.out.println(Iterables.contains(personsFilteredByAge, person3));
    }


    @Test
    public void testAnyMatch() throws Exception {
        Predicate<Person> personOlderThan31Predicate =  new Predicate<Person>() {
            @Override
            public boolean apply(Person input) {
                return input.getAge() > 35;
            }
        };

        System.out.println(FluentIterable.from(personList).anyMatch(personOlderThan31Predicate));
    }

    @Test
    public void testAllMatch() throws Exception {
        Predicate<Person> personOlderThan31Predicate =  new Predicate<Person>() {
            @Override
            public boolean apply(Person input) {
                return input.getAge() > 29;
            }
        };

        System.out.println(FluentIterable.from(personList).allMatch(personOlderThan31Predicate));
    }

    public  void testTransfer(){
        ImmutableList<String> list = FluentIterable.from(personList).transform(new Function<Person, String>() {
            @Override
            public String apply(Person input) {
                return input.getFirstName();
            }
        }).toList();
    }
}