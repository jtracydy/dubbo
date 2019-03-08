/*
*  2019 
*/
package pattern.iterat.own;

/**
 * @author wangdan Date: 2019/3/8 Time: 16:07
 * @version $Id$
 */
public interface Itr<T> {

    void add(T t);

    void remove(T t);

    DefIterator<T> getIterator();
}