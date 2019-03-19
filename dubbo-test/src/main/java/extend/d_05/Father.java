/*
*  2019 
*/
package extend.d_05;

/**
 * @author wangdan Date: 2019/3/18 Time: 19:48
 * @version $Id$
 */
public class Father {

    Context context;

    public Father(Context context) {
        System.out.println("father construct....¬");
        this.context = context;
    }

    public void tt() {
        context.get();
    }

}