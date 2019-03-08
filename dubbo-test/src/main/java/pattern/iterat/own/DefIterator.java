/*
*  2019 
*/
package pattern.iterat.own;

/**
 * @author wangdan Date: 2019/3/8 Time: 16:06
 * @version $Id$
 */
public interface DefIterator<T> {

    boolean hasNext();

    T next();
}