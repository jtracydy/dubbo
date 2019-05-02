/*
*  2019 
*/
package arithematic.dynamic;


import arithematic.CommonUtils;

/**
 * @author wangdan Date: 2019/5/2 Time: 10:30
 * @version $Id$
 */
public class Demo02 {


    private static int arr[][] = {{2, 3, 4, 5, 6, 7}, {3, 4, 5, 6, 6, 9}};

    /**
     * 01 背包问题
     */

    public static void main(String[] args) {
        int res[] = f(10);
        CommonUtils.out(res);
    }

    public static int[] f(int volume) {
        int res[] = CommonUtils.init(volume);
        if (volume < 2) {
            return res;
        }
        for (int i = 2; i <= volume; i++) {
        res[i] = compare(res, i);
    }
        return res;
    }

    public static int compare(int res[], int k) {
        int max = 0;
        int tt = find(k);
        if (tt != 0) {
            max = tt;
        }
        for (int i = 2; i < k / 2; i++) {
            int temp = res[i] + res[k - i];
            if (max < temp) {
                max = temp;
            }
        }
        return max;
    }

    public static int find(int k) {
        for (int i = 0; i < arr[0].length; i++) {
            if (k == arr[0][i]) {
                return arr[1][i];
            }
        }
        return 0;
    }
}