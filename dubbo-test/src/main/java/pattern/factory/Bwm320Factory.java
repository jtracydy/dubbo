/*
*  2019 
*/
package pattern.factory;

/**
 * 工厂模式具体类
 * @author wangdan Date: 2019/3/5 Time: 09:42
 * @version $Id$
 */
public class Bwm320Factory implements CarFactory2{

    @Override
    public Bmw createFactory() {
        return new Bwm320();
    }
}