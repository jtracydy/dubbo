/*
*  2019 
*/
package arithematic.back_up;

/**
 * @author wangdan Date: 2019/5/1 Time: 14:07
 * @version $Id$
 */
public class Demo07 {

    /**
     * 全排列
     */

    static int count = 0;

    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        ff(a, 0);
        System.out.println(count);
    }

    public static void f(int arr[], int index) {
        if (index >= arr.length) {
            count++;
            System.out.println(java.util.Arrays.toString(arr));
        }
        for (int i = index; i < arr.length; i++) {
            if (!is(arr, index, i)) {
                continue;
            }
            swap(arr, i, index);
            //用递归进行下一个数的交换
            ff(arr, index + 1);
            swap(arr, index, i);
        }
    }

    public static boolean is(int[] a, int b, int i) {
        for (int j = b; j < i; j++) {
            if (a[i] == a[j]) {
                return false;
            }
        }
        return true;
    }

    public static void ff(int[] a, int b) {
        if (b >= a.length) {
            count++;
            System.out.println(java.util.Arrays.toString(a));
        }
        for (int i = b; i < a.length; i++) {
            swap(a, i, b);
            //用递归进行下一个数的交换
            ff(a, b + 1);
            swap(a, b, i);
        }
    }

    public static void swap(int arr[], int from, int to) {
        if (from == to) {
            return;
        }
        int temp = arr[from];
        arr[from] = arr[to];
        arr[to] = temp;
    }
}