/*
*  2019 
*/
package pattern.decorator.own;

/**
 * @author wangdan Date: 2019/3/19 Time: 10:04
 * @version $Id$
 */
public abstract class DecoratorBird implements Bird {

    private Bird bird;

    public DecoratorBird(Bird bird) {
        this.bird = bird;
    }

    @Override
    public void fly() {
        bird.fly();
        System.out.println(" DecoratirBird fly  再来 3 天 .....");
    }
}