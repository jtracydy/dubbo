/*
*  2018 
*/
package extend.d_03;

/**
 * @author wangdan Date: 2018/12/17 Time: 19:50
 * @version $Id$
 */
public class Test {

    public static void main(String[] args) {
        Father f = new Father() {
            @Override
            String getAge() {
                return null;
            }
        };

        Father f1 = new Father("123") {
            @Override
            String getAge() {
                return null;
            }
        };
    }
}