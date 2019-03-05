/*
*  2019 
*/
package pattern.factory;

/**
 * @author wangdan Date: 2019/3/5 Time: 09:43
 * @version $Id$
 */
public class Bwm530Factory implements CarFactory2 {

    @Override
    public Bmw createFactory() {
        return new Bwm530();
    }
}