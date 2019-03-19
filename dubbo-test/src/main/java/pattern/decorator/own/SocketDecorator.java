/*
*  2019 
*/
package pattern.decorator.own;

/**
 * @author wangdan Date: 2019/3/19 Time: 10:07
 * @version $Id$
 */
public class SocketDecorator extends DecoratorBird {

    public SocketDecorator(Bird bird) {
        super(bird);
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println(" socket fly  1 second .....");
    }
}