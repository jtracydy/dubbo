/*
*  2019 
*/
package arithematic.sort;

import arithematic.CommonUtils;

/**
 * @author wangdan Date: 2019/5/18 Time: 11:58
 * @version $Id$
 */
public class Demo02 {

    public static int count = 0;

    public static void main(String[] args) {
        int arr[] = {364, 637, 341, 406, 747, 995, 234, 971, 571,
                219, 993, 407, 416, 366, 315, 301, 601, 650, 418,
                355, 460, 505, 360, 965, 516, 648, 727, 667, 465,
                849, 455, 181, 486, 149, 588, 233, 144, 174, 557,
                67, 746, 550, 474, 162, 268, 142, 463, 221, 882,
                576, 604, 739, 288, 569, 256, 936, 275, 401, 497,
                82, 935, 983, 583, 523, 697, 478, 147, 795, 380,
                973, 958, 115, 773, 870, 259, 655, 446, 863, 735,
                784, 3, 671, 433, 630, 425, 930, 64, 266, 235, 187,
                284, 665, 874, 80, 45, 848, 38, 811, 267, 575};
//        new Demo02().f(arr, 0, arr.length - 1);
        new Demo02().InversePairs(arr);
//        CommonUtils.out(arr);
        System.out.println(count);
    }

    public int InversePairs(int[] array) {
        if (array.length <= 1) {
            return 0;
        }
        f(array, 0, array.length - 1);
        return count % 1000000007;
    }

    /**
     * 归并
     */

    public void f(int arr[], int from, int to) {
        if (from == to) {
            return;
        }
        int mid = (from + to) / 2;
        f(arr, from, mid);
        f(arr, mid + 1, to);
        merge(arr, from, mid, to);
    }

    public void merge(int arr[], int from, int mid, int to) {
        int l = from;
        int r = mid + 1;
        int res[] = new int[arr.length];
        int k = from;
        while (l <= mid && r <= to) {
            if (arr[l] > arr[r]) {
                count = count + mid - l + 1;
                res[k++] = arr[r++];
            } else {
                res[k++] = arr[l++];
            }
        }

        while (l <= mid) {
            res[k++] = arr[l++];
        }
        while (r <= to) {
            res[k++] = arr[r++];
        }

        for (int i = from; i <= to; i++) {
            arr[i] = res[i];
        }
    }
}