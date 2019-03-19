/*
*  2019 
*/
package pattern.decorator.example;

/**
 * 实现接口的抽象装饰类，建议设置成abstract.
 */
public abstract class PancakeDecorator implements IPancake {

    /***/
    private IPancake pancake;

    public PancakeDecorator(IPancake pancake) {
        this.pancake = pancake;
    }

    public void cook() {
        if (this.pancake != null) {
            pancake.cook();
        }
    }
}