/*
*  2019 
*/
package pattern.observe.own;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * 主题 和 观察者关联
 *
 * @author wangdan Date: 2019/3/8 Time: 14:19
 * @version $Id$
 */
public class SubjectImpl implements Subject {

    private List<Observer> observers = Lists.newArrayList();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyAllObserver(String status) {
        for (Observer observer : observers) {
            observer.notifyIt(status);
        }
    }

}