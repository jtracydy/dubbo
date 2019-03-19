/*
*  2019 
*/
package pattern.iterat.own;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @author wangdan Date: 2019/3/8 Time: 16:09
 * @version $Id$
 */
public class DefIteratorImpl<T> implements DefIterator<T> {

    List<T> list = Lists.newArrayList();

    public DefIteratorImpl(List<T> list) {
        this.list = list;
    }

    int cur = 0;

    @Override
    public boolean hasNext() {
        return list.size() > cur;
    }

    @Override
    public T next() {
        return list.get(cur++);
    }
}