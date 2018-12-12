/*
*  2018 
*/
package extend.d_02;

/**
 * @author wangdan Date: 2018/12/9 Time: 10:24
 * @version $Id$
 */
public class Son1 extends Father {

    @Override
    protected void methodProtected() {
        System.out.println("son1 protected method");
    }

    @Override
    void methodDefault() {
        System.out.println("son1 method default");
    }
}