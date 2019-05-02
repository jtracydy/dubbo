/*
*  2019 
*/
package arithematic.dynamic;

import arithematic.CommonUtils;

/**
 * @author wangdan Date: 2019/5/2 Time: 14:19
 * @version $Id$
 */
public class Demo04 {


    /**
     * 斐波那契
     *
     * @param args
     */
    public static void main(String[] args) {
        int arr[] = f(10);
        CommonUtils.out(arr);
    }


    public static int[] f(int n) {
        int arr[] = CommonUtils.init(n);
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr;
    }

}