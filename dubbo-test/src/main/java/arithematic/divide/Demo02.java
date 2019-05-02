/*
*  2019 
*/
package arithematic.divide;


import org.apache.commons.lang3.tuple.Pair;

/**
 * @author wangdan Date: 2019/4/27 Time: 14:24
 * @version $Id$
 */
public class Demo02 {

    /**
     * 求数组的最大值和最小值问题
     */

    public static void main(String[] args) {
        int arr[] = {9, 7, 2, 6, 5, 3, 8, 4};
        System.out.println(r(arr, 0, arr.length - 1));
    }


    public static Pair<Integer, Integer> r(int arr[], int from, int to) {
        if (from == to) {
            return Pair.of(arr[from], arr[to]);
        }
        int mid = (from + to) / 2;
        Pair<Integer, Integer> left = r(arr, from, mid);
        Pair<Integer, Integer> right = r(arr, mid + 1, to);
        return f(left, right);
    }

    /**
     * 拆分，解决，合并
     */
    private static Pair<Integer, Integer> f(Pair<Integer, Integer> left, Pair<Integer, Integer> right) {
        int min = 0;
        int max = 0;
        if (left.getLeft() > right.getLeft()) {
            min = right.getLeft();
        } else {
            min = left.getLeft();
        }

        if (left.getRight() > right.getRight()) {
            max = left.getRight();
        } else {
            max = right.getRight();
        }
        return Pair.of(min, max);
    }
}