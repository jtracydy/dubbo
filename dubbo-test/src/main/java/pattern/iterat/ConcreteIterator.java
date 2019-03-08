/*
*  2019 
*/
package pattern.iterat;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wangdan Date: 2019/3/8 Time: 15:39
 * @version $Id$
 */
public class ConcreteIterator implements Iterator {

    private List list = new ArrayList();
    private int cursor = 0;

    public ConcreteIterator(List list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        if (cursor == list.size()) {
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        Object obj = null;
        if (this.hasNext()) {
            obj = this.list.get(cursor++);
        }
        return obj;
    }
}