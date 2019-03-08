/*
*  2019 
*/
package pattern.iterat.own;

/**
 * @author wangdan Date: 2019/3/8 Time: 16:09
 * @version $Id$
 */
public class DefIteratorImpl<T> implements DefIterator<T>{

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public T next() {
        return null;
    }
}