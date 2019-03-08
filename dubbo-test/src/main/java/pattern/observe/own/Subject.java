/*
*  2019 
*/
package pattern.observe.own;

/**
 * @author wangdan Date: 2019/3/8 Time: 15:03
 * @version $Id$
 */
public interface Subject {


    void addObserver(Observer observer);

    void remove(Observer observer);

    void notifyAllObserver(String status);
}