/*
*  2019 
*/
package pattern.template.example;

/**
 * @author wangdan Date: 2019/6/13 Time: 16:11
 * @version $Id$
 */

public abstract class DriveTemplate {

    public final void drive() {
        openDoor();
        startEngine();
        gear();
        go();
        brake();
        stop();
    }

    protected abstract void openDoor();

    protected void startEngine() {
        System.out.println("engine started !");
    }

    protected abstract void gear();

    protected void go() {
        System.out.println("running...");
    }

    protected abstract void brake();

    protected void stop() {
        System.out.println("stopped !");
    }
}