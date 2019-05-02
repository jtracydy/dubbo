/*
*  2019 
*/
package arithematic.divide;


import com.google.common.collect.Lists;

import java.util.List;

/**
 * @author wangdan Date: 2019/4/27 Time: 10:27
 * @version $Id$
 */
public class Demo01 {

    static int count = 0;


    /**
     * 分治法 求最大子数组的
     */

    public static void main(String[] args) {
        int arr[] = {12, -3, -25, 20, -3, -16, -23, 18, 20, -7, 12, -5, -22, 15, -4, 7};
        //int arr[] = {12, 13, -25, 20,-1,2};
        System.out.println(maxNum(arr, 0, arr.length - 1));
    }


    /**
     * 左右两遍最大值的求法有说法，从中间开始求解两边最大值，整个区间的最大值是从中间开始连续的最大值
     *
     * @param arr
     * @param low
     * @param height
     * @param mid
     * @return
     */
    private static List<Integer> max(int arr[], int low, int height, int mid) {
        int l_sum = Integer.MIN_VALUE;
        int sum = 0;
        int l_index = 0;

        /**
         * 左边最大值
         */
        for (int i = mid; i >= low; i--) {
            sum = sum + arr[i];
            if (l_sum < sum) {
                l_sum = sum;
                l_index = i;
            }
        }

        int r_sum = Integer.MIN_VALUE;
        sum = 0;
        int r_index = 0;
        for (int i = mid + 1; i <= height; i++) {
            sum = sum + arr[i];
            if (r_sum < sum) {
                r_sum = sum;
                r_index = i;
            }
        }

        return Lists.newArrayList(l_index, r_index, l_sum + r_sum);
    }

    private static List<Integer> maxNum(int arr[], int low, int height) {
        System.out.println("count=" + ++count + "--" + low + "-" + height);
        if (low == height) {
            return Lists.newArrayList(low, height, arr[low]);
        }
        /**
         * 拆分
         */
        int mid = (low + height) / 2;
        List<Integer> l_num = maxNum(arr, low, mid);
        List<Integer> r_num = maxNum(arr, mid + 1, height);

        List<Integer> max_num = max(arr, low, height, mid);

        if (l_num.get(2) >= r_num.get(2) && l_num.get(2) >= max_num.get(2)) {
            return l_num;
        } else if (r_num.get(2) >= l_num.get(2) && r_num.get(2) >= max_num.get(2)) {
            return r_num;
        }
        return max_num;
    }
}