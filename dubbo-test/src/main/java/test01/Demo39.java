/*
*  2019 
*/
package test01;

/**
 * @author wangdan Date: 2019/9/30 Time: 08:44
 * @version $Id$
 */
public class Demo39 {

    public static void main(String[] args) {
        new Thread(() -> {
            Demo01.f();
        }).start();
    }
}