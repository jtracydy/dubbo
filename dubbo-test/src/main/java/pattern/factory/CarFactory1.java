/*
*  2019 
*/
package pattern.factory;

/**
 * 抽象工厂类 - 静态工厂模式
 *
 * @author wangdan Date: 2019/3/5 Time: 09:30
 * @version $Id$
 */
public class CarFactory1 {

    public static Bmw getCar(String type) {
        if (type.equals("320")) {
            return new Bwm320();
        } else if (type.equals("530")) {
            return new Bwm530();
        }
        return null;
    }
}