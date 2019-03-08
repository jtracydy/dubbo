/*
*  2019 
*/
package pattern.observe.own;

/**
 * @author wangdan Date: 2019/3/8 Time: 14:38
 * @version $Id$
 */
public class ObserverImpl implements Observer {

    @Override
    public void notifyIt(String state) {
        System.out.println(ObserverImpl.class.getName() + " " + state);
    }
}