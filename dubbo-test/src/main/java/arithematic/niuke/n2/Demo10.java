/*
*  2019 
*/
package arithematic.niuke.n2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wangdan Date: 2019/5/12 Time: 11:05
 * @version $Id$
 */
public class Demo10 {


    public static void main(String[] args) {
        int arr[] = {12, -3, -25, 20, -3, -16, -23, 18, 20, -7, 12, -5, -22, 15, -4, 7};
        System.out.println(new Demo10().FindGreatestSumOfSubArray(arr));
    }

    public int FindGreatestSumOfSubArray(int[] array) {
        if (array.length == 1) {
            return array[0];
        }
        return f(array, 0, array.length - 1).get(2);
    }

    public List<Integer> f(int arr[], int from, int to) {
        List<Integer> arrayList = new ArrayList<>();
        if (from == to) {
            arrayList.add(from);
            arrayList.add(to);
            arrayList.add(arr[from]);
            return arrayList;
        }
        int mid = (from + to) / 2;
        List<Integer> ll = f(arr, from, mid);
        List<Integer> rl = f(arr, mid + 1, to);
        List<Integer> max = interMax(arr, from, mid, to);

        if (ll.get(2) > rl.get(2) && ll.get(2) > max.get(2)) {
            return ll;
        } else if (rl.get(2) > ll.get(2) && rl.get(2) > max.get(2)) {
            return rl;
        } else {
            return max;
        }
    }

    public List<Integer> interMax(int arr[], int from, int mid, int to) {
        int lm = Integer.MIN_VALUE;
        int count = 0;
        int l_index = 0;
        for (int i = mid; i >= from; i--) {
            count = count + arr[i];
            if (count > lm) {
                lm = count;
                l_index = i;
            }
        }
        int rm = Integer.MIN_VALUE;
        count = 0;
        int r_index = 0;
        for (int i = mid + 1; i <= to; i++) {
            count = count + arr[i];
            if (count > rm) {
                rm = count;
                r_index = i;
            }
        }
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(l_index);
        arrayList.add(r_index);
        arrayList.add(rm + lm);
        return arrayList;
    }
}