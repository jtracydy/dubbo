/*
*  2019 
*/
package pattern.decorator.own;

/**
 * @author wangdan Date: 2019/3/19 Time: 10:09
 * @version $Id$
 */
public class TestDecorator {

    public static void main(String[] args) {

        Bird bird = new Dayan();
        DecoratorBird decoratorBird = new SocketDecorator(bird);
        decoratorBird.fly();
    }
}