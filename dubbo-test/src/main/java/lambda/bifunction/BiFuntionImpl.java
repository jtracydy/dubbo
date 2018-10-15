package lambda.bifunction;

import java.util.function.BiFunction;

public class BiFuntionImpl<T, U, R> implements BiFunction<T, U, R>{

    @Override
    public R apply(T t, U u) {
        String s1 = (String)t;
        String s2 = (String)u;
        return (R)s1.concat(s2);
    }
}
