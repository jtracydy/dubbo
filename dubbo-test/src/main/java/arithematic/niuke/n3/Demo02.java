/*
*  2019 
*/
package arithematic.niuke.n3;

import java.util.ArrayList;

/**
 * @author wangdan Date: 2019/5/26 Time: 10:20
 * @version $Id$
 */
public class Demo02 {

    /**
     * 输入一个递增排序的数组和一个数字S，在数组中查找两个数，
     * 使得他们的和正好是S，如果有多对数字的和等于S，输出两个数的乘积最小的。
     */

    public static void main(String[] args) {
        System.out.println(new Demo02().f(1));
        int arr[] = {1, 2, 4, 7, 11, 15};
        System.out.println(new Demo02().FindNumbersWithSum(arr, 15));
    }

    public ArrayList<Integer> FindNumbersWithSum(int[] array, int sum) {
        if (array.length == 0 || sum == 0) {
            return new ArrayList<>();
        }
        int l = 0;
        int r = array.length - 1;
        while (l < r) {
            if (array[l] + array[r] == sum) {
                ArrayList<Integer> tt = new ArrayList<>();
                tt.add(array[l]);
                tt.add(array[r]);
                return tt;
            } else if (array[l] + array[r] < sum) {
                l++;
            } else {
                r--;
            }
        }
        return new ArrayList<>();
    }

    public ArrayList<ArrayList<Integer>> f(int sum) {
        int l = 1;
        int r = sum;
        int index = 2;
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        ArrayList<Integer> tt = new ArrayList<>();
        tt.add(1);
        tt.add(sum);
        result.add(tt);
        while (l <= r && index < sum) {
            ArrayList<Integer> temp = new ArrayList<>();
            if (sum % index != 0) {
                index++;
            } else {
                l = 1 * index;
                r = sum / index;
                if (l > r) {
                    break;
                }
                temp.add(l);
                temp.add(r);
                index++;
                result.add(temp);
            }
        }
        return result;
    }
}