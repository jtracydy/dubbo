/*
*  2019 
*/
package pattern.observe.own;

/**
 * @author wangdan Date: 2019/3/8 Time: 14:44
 * @version $Id$
 */
public class Test {

    public static void main(String[] args) {
        Observer o1 = new ObserverImpl();
        Observer o2 = new ObserverImpl01();

        Subject subject = new SubjectImpl();
        subject.addObserver(o1);
        subject.addObserver(o2);
        subject.notifyAllObserver("hahahahahahhah");
    }
}