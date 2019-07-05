/*
*  2019 
*/
package pattern.template.example;

/**
 * @author wangdan Date: 2019/6/13 Time: 16:12
 * @version $Id$
 */
public class SuzukiScross extends DriveTemplate {

    @Override
    protected void openDoor() {
        System.out.println("keyless entry");
    }

    @Override
    protected void gear() {
        System.out.println("gear with hand");
    }

    @Override
    protected void brake() {
        System.out.println("brake with foot");
    }
}