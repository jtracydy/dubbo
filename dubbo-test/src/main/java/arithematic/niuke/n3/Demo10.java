/*
*  2019 
*/
package arithematic.niuke.n3;

import arithematic.niuke.Common;

/**
 * @author wangdan Date: 2019/6/2 Time: 11:40
 * @version $Id$
 */
public class Demo10 {

    /**
     * 给定一个数组A[0,1,...,n-1],请构建一个数组B[0,1,...,n-1],
     * 其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。不能使用除法。
     */

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        Common.outArr(new Demo10().multiply(arr));
    }

    public int[] multiply(int[] A) {
        if (A == null || A.length == 0) {
            return null;
        }
        int arr1[] = f(A);
        int arr2[] = g(A);
        int res[] = new int[A.length];
        for (int i = 0; i < res.length; i++) {
            res[i] = arr1[i] * arr2[i];
        }
        return res;
    }

    public int[] g(int arr[]) {
        int res[] = new int[arr.length];
        res[arr.length - 1] = 1;
        for (int i = arr.length - 2; i >= 0; i--) {
            res[i] = res[i + 1] * arr[i + 1];
        }
        return res;
    }

    public int[] f(int arr[]) {
        int res[] = new int[arr.length];
        res[0] = 1;
        for (int i = 1; i < arr.length; i++) {
            res[i] = res[i - 1] * arr[i - 1];
        }
        return res;
    }
}