/*
*  2018 
*/
package extend.d_02;

/**
 * @author wangdan Date: 2018/12/9 Time: 10:26
 * @version $Id$
 */
public class Test {

    public static void main(String[] args) {
        Father f = new Son1();
        f.getName(Son1.class);;

        Son1 s1 = new Son1();
        s1.methodDefault();
        s1.methodProtected();
        s1.getName(Son1.class);
    }
}