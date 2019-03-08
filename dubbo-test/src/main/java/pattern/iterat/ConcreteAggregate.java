/*
*  2019 
*/
package pattern.iterat;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wangdan Date: 2019/3/8 Time: 15:40
 * @version $Id$
 */
public class ConcreteAggregate implements Aggregate {
    private List list = new ArrayList();

    @Override
    public void add(Object obj) {
        list.add(obj);
    }

    @Override
    public Iterator iterator() {
        return new ConcreteIterator(list);
    }

    @Override
    public void remove(Object obj) {
        list.remove(obj);
    }
}