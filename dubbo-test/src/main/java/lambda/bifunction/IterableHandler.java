package lambda.bifunction;

import java.util.Collection;
import java.util.Iterator;

public class IterableHandler<T> implements Iterator<Collection<T>> {

    Integer start = 0;
    Integer end = 0;



    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Collection<T> next() {
        return null;
    }
}
