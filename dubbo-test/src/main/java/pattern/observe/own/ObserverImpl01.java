/*
*  2019 
*/
package pattern.observe.own;

/**
 * @author wangdan Date: 2019/3/8 Time: 14:45
 * @version $Id$
 */
public class ObserverImpl01 implements Observer {

    @Override
    public void notifyIt(String state) {
        System.out.println(ObserverImpl01.class.getName() + " " + state);
    }
}