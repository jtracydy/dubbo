/*
*  2019 
*/
package extend.d_05;

/**
 * @author wangdan Date: 2019/3/18 Time: 19:51
 * @version $Id$
 */
public class Son extends Father {


    public Son(Context context) {
        super(context);
        System.out.println("son construct....");
    }

    public void tt() {
        super.tt();
        System.out.println("ttt con....");
    }

    public static void main(String[] args) {
        Son son = new Son(new Context());
        son.tt();
    }
}