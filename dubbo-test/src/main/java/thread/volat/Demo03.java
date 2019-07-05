/*
*  2019 
*/
package thread.volat;

/**
 * @author wangdan Date: 2019/5/12 Time: 12:01
 * @version $Id$
 */
public class Demo03 {

    private static volatile Demo03 demo03;

    private static Demo03 getDemo03() {
        if (demo03 == null) {
            synchronized (Demo03.class) {
                if (null == demo03) {
                    demo03 = new Demo03();
                }
            }
        }
        return demo03;
    }
}