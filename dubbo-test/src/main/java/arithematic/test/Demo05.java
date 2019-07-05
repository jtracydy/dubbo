/*
*  2019 
*/
package arithematic.test;

/**
 * @author wangdan Date: 2019/5/19 Time: 10:51
 * @version $Id$
 */
public class Demo05 {


    /**
     * 二分查找
     */
    public static void main(String[] args) {
        int arr[] = {3};
        System.out.println(new Demo05().GetNumberOfK(arr, 3));
    }


    public int f(int arr[], int t) {
        return g(arr, 0, arr.length - 1, t);
    }

    public int g(int arr[], int from, int to, int t) {
        if (from == to) {
            if (arr[to] == t) {
                return to;
            }
            return -1;
        }
        int mid = (from + to) / 2;
        if (arr[mid] == t) {
            return mid;
        } else if (t > arr[mid]) {
            return g(arr, mid + 1, to, t);
        } else {
            return g(arr, from, mid, t);
        }
    }

    public int GetNumberOfK(int[] array, int k) {
        if (array.length == 0) {
            return 0;
        }
        int index = g(array, 0, array.length - 1, k);
        if (index == -1) {
            return 0;
        }
        return d(array, index);
    }

    public int d(int arr[], int index) {
        int count = 1;
        for (int i = index - 1; i >= 0; i--) {
            if (arr[i] == arr[index]) {
                count++;
            }
        }

        for (int i = index + 1; i < arr.length; i++) {
            if (arr[i] == arr[index]) {
                count++;
            }
        }
        return count;
    }
}