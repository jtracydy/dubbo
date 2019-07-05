/*
*  2019 
*/
package arithematic.sort;

import arithematic.CommonUtils;

/**
 * @author wangdan Date: 2019/6/29 Time: 10:10
 * @version $Id$
 */
public class Demo03 {


    public static void main(String[] args) {
        int arr[] = {2, 7, 9, 6, 4, 8, 3, 1, 5};
        f(arr, arr.length - 1);
        CommonUtils.out(arr);
    }


    /**
     * 堆排 -- 小顶堆
     */

    public static void f(int arr[], int k) {
        if (k == 0 || k > arr.length) {
            return;
        }

        int i = k;
        while (i >= 0) {
            if (2 * i + 1 > k) {
                i--;
                continue;
            }
            int temp = arr[2 * i + 1];
            int index = 2 * i + 1;
            if (2 * i + 2 <= k && arr[index] > arr[2 * i + 2]) {
                temp = arr[2 * i + 2];
                index = 2 * i + 2;
            }
            if (temp < arr[i]) {
                swap(arr, i, index);
            }
            i--;
        }
        swap(arr, 0, k);
        f(arr, --k);
    }

    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}