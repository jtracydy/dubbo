package leecode;/*
*  2019 
*/

import arithematic.CommonUtils;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author wangdan Date: 2019/8/24 Time: 09:11
 * @version $Id$
 */
public class LeeCode0001 {

    public static void main(String[] args) {
        int[] arr = new int[]{3, 2, 4};

        int res[] = twoSum2(arr, 6);
        CommonUtils.out(res);
    }

    /**
     * 两数之和为target的数组下标
     *
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum(int[] nums, int target) {
        if (null == nums || nums.length <= 0) {
            return new int[0];
        }
        int[] arr = new int[2];
        int[] copy = nums.clone();
        Arrays.sort(copy);

        int start = 0;
        int end = copy.length - 1;
        int k = 0;
        while (start < end) {
            if (copy[start] + copy[end] > target) {
                end--;
            } else if (copy[start] + copy[end] < target) {
                start++;
            } else {
                arr[k++] = copy[start];
                arr[k++] = copy[end];
                break;
            }
        }

        int[] res = new int[2];
        k = 0;
        int first = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (j != first && nums[j] == arr[i]) {
                    res[k++] = j;
                    first = j;
                    break;
                }
            }
        }
        return res;
    }


    public static int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> hashmap = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            int k = target - nums[i];
            if (hashmap.containsKey(k)) {
                return new int[]{hashmap.get(k), i};
            } else {
                hashmap.put(nums[i], i);
            }
        }
        return null;
    }
}