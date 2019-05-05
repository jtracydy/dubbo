/*
*  2019 
*/
package arithematic.niuke.n1;

import arithematic.niuke.Common;

/**
 * @author wangdan Date: 2019/3/26 Time: 19:27
 * @version $Id$
 */
public class Demo07 {

    /**
     * 大家都知道斐波那契数列，现在要求输入一个整数n，
     * 请你输出斐波那契数列的第n项（从0开始，第0项为0）。
     * n<=39
     */

    public static void main(String[] args) {
        System.out.println(new Demo07().Fibonacci(7));
    }

    public int Fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int arr[] = new int[n + 1];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        Common.outArr(arr);
        return arr[n];
    }

}