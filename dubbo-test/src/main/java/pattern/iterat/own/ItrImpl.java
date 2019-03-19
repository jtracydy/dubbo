/*
*  2019 
*/
package pattern.iterat.own;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @author wangdan Date: 2019/3/8 Time: 19:47
 * @version $Id$
 */
public class ItrImpl<T> implements Itr<T> {

    List<T> list = Lists.newArrayList();

    @Override
    public void add(T o) {
        list.add(o);
    }

    @Override
    public void remove(T o) {
        list.remove(o);
    }

    @Override
    public DefIterator getIterator() {
        return new DefIteratorImpl(list);
    }
}