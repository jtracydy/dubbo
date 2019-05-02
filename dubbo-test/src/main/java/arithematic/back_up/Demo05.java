/*
*  2019 
*/
package arithematic.back_up;


/**
 * @author wangdan Date: 2019/5/1 Time: 11:35
 * @version $Id$
 */
public class Demo05 {

    private static int cp = 11;

    /**
     * 01 背包问题
     */

    public static void main(String[] args) {
        int arr[][] = {{2, 3, 4, 5, 6, 7}, {3, 4, 5, 6, 6, 9}};
        int brr[][] = {{0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0}};
        f(0, arr, brr, 0, 0);
    }

    /**
     * @param arr 原始数据
     * @param brr 价值数据
     * @param v   当前体积
     * @param p   最大的价值
     */
    public static void f(int i, int arr[][], int brr[][], int v, int p) {
        if (i >= arr[0].length - 1) {
            System.out.println(p);
            out(brr);
            return;
        }
        int vv = arr[0][i];
        int pp = arr[1][i];
        if ((v + vv) <= cp) {
            brr[0][i] = vv;
            brr[1][i] = pp;
            p = p + pp;
            v = v + vv;
            f(i + 1, arr, brr, v, p);
            brr[0][i] = 0;
            brr[1][i] = 0;
            p = p - pp;
            v = v - vv;
            f(i + 1, arr, brr, v, p);
        } else {
            f(i + 1, arr, brr, v, p);
        }


    }

    private static void out(int arr[][]) {
        for (int j = 0; j < arr[0].length; j++) {
            System.out.print(" v=" + arr[0][j] + " p=" + arr[1][j] + " ");
        }
        System.out.println();
    }
}