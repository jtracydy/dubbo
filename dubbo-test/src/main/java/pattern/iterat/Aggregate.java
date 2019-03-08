/*
*  2019 
*/
package pattern.iterat;

/**
 * @author wangdan Date: 2019/3/8 Time: 15:40
 * @version $Id$
 */
public interface Aggregate {

    void add(Object obj);

     void remove(Object obj);

     Iterator iterator();

}