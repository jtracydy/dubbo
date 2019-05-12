/*
*  2019 
*/
package arithematic.niuke.n2;

/**
 * @author wangdan Date: 2019/5/5 Time: 09:56
 * @version $Id$
 */
public class Demo03 {

    /**
     * 二叉搜索树的是否是排序树
     */

    public static void main(String[] args) {
        int arr[] = {4, 9, 7, 11, 12, 13, 17, 15, 10};
        System.out.println(VerifySquenceOfBST(arr));
    }


    public static boolean divide(int arr[], int from, int to) {
        if (from >= to) {
            return true;
        }
        int i = to - 1;
        for (; i >= 0; i--) {
            if (arr[i] <= arr[to]) {
                break;
            }
        }
        if (!jude(arr, from, i, to)) {
            return false;
        }
        return divide(arr, from, i-1) && divide(arr, i , to-1);
    }

    public static boolean jude(int arr[], int from, int to, int aim) {
        if (from >= to) {
            return true;
        }
        for (int i = from; i <= to; i++) {
            if (arr[from] > arr[aim]) {
                return false;
            }
        }
        return true;
    }


    public static boolean VerifySquenceOfBST(int[] sequence) {
        if (sequence.length == 0) {
            return false;
        }
        if (sequence.length == 1) {
            return true;
        }
        return judge(sequence, 0, sequence.length - 1);
    }

    public static boolean judge(int[] a, int start, int end) {
        if (start >= end) {
            return true;
        }
        int i = start;
        while (a[i] < a[end]) {
            ++i;
        }
        for (int j = i; j < end; j++) {
            if (a[j] < a[end]) {
                return false;
            }
        }
        return judge(a, start, i - 1) && judge(a, i, end - 1);
    }
}