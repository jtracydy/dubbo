/*
*  2019 
*/
package pattern.observe.example;

/**
 * @author wangdan Date: 2019/3/8 Time: 14:26
 * @version $Id$
 */
public interface Subject {
    /**
     * 增加订阅者
     *
     * @param observer
     */
    void attach(Observer observer);

    /**
     * 删除订阅者
     *
     * @param observer
     */
    void detach(Observer observer);

    /**
     * 通知订阅者更新消息
     */
    void notify(String message);
}