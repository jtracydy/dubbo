/*
*  2019 
*/
package arithematic.niuke;


/**
 * @author wangdan Date: 2019/5/2 Time: 16:04
 * @version $Id$
 */
public class Demo10 {

    public static void main(String[] args) {
        System.out.println(f(2));
    }

    public static int f(int target) {
        if (target == 0) {
            return 0;
        }

        int arr[] = init(target);
        arr[1] = 1;
        for (int i = 2; i <= target; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[target];
    }

    public static int[] init(int n) {
        int res[] = new int[n + 1];
        for (int i = 0; i < n; i++) {
            res[i] = 0;
        }
        return res;
    }
}