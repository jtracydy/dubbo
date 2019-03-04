/*
*  2018 
*/
package pattern;

/**
 * @author wangdan Date: 2018/12/17 Time: 15:55
 * @version $Id$
 */
public class Demo01 {

    public static void main(String[] args) {
        System.out.println(getSum());
    }

    public static int getSum() {
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            sum += i;
        }
        return sum;
    }
}