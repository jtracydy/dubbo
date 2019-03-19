/*
*  2019 
*/
package pattern.decorator.example;

/**
 * 具体的煎饼对象，可用其他装饰类进行动态扩展。
 */
public class Pancake implements IPancake {

    public void cook() {
        System.out.println("的煎饼");
    }
}