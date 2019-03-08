/*
*  2019 
*/
package pattern.observe.own;

/**
 * 一类观察者
 * @author wangdan Date: 2019/3/8 Time: 14:18
 * @version $Id$
 */
public interface Observer {

    void notifyIt(String state);
}