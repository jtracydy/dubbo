package guava.optional;

import com.google.common.base.Enums;
import com.google.common.base.Function;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;

import java.util.List;

public class Demo02 {

    public static void main(String[] args) {
        List<String> days = Lists.newArrayList(
                "WEDNESDAY",
                "SUNDAY",
                "MONDAY",
                "WEDNESDAY");

        Function<String, Day> stringToDayEnum = Enums.stringConverter(Day.class);

        Iterable<Day> daysAsEnum = Iterables.transform(days, stringToDayEnum);

        for(Day day : daysAsEnum) {
            System.out.println(day);
        }
    }
}
