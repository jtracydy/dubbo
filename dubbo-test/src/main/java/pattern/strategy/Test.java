/*
*  2019 
*/
package pattern.strategy;

/**
 * @author wangdan Date: 2019/3/5 Time: 20:16
 * @version $Id$
 */
public class Test {


    public static void main(String[] args) {
        Context context1 = new Context(new Strategy01());
        context1.execute();
        Context context2 = new Context(new Strategy02());
        context2.execute();
    }
}