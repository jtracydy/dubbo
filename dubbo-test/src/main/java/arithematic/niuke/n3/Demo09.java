/*
*  2019 
*/
package arithematic.niuke.n3;

import java.util.HashSet;
import java.util.Set;

/**
 * @author wangdan Date: 2019/6/2 Time: 10:59
 * @version $Id$
 */
public class Demo09 {


    /**
     * 一个长度为n的数组里的所有数字都在0到n-1的范围内。 数组中某些数字是重复的，
     * 但不知道有几个数字是重复的。也不知道每个数字重复几次。请找出数组中任意一个重复的数字。
     * 例如，如果输入长度为7的数组{2,3,1,0,2,5,3}，那么对应的输出是第一个重复的数字2。
     */

    public static void main(String[] args) {
        int[] arr = {};
        System.out.println(new Demo09().duplicate(arr, arr.length, new int[1]));
    }

    public boolean duplicate(int numbers[], int length, int[] duplication) {
        if (numbers == null || numbers.length == 0|| duplication.length == 0) {
            return false;
        }
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < numbers.length; i++) {
            if (set.contains(numbers[i])) {
                duplication[0] = numbers[i];
                return true;
            }
            set.add(numbers[i]);
        }
        return false;
    }
}