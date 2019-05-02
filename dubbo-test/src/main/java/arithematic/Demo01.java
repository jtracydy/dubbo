/*
*  2019 
*/
package arithematic;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wangdan Date: 2019/3/30 Time: 20:10
 * @version $Id$
 */
public class Demo01 {


    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 3, 4, 4, 4, 5};
        get(arr);
    }

    public static void get(int arr[]) {
        if (arr.length < 0) {
            return;
        }
        Map<Integer, Integer> map = new HashMap<>();
        /**
         * map key存放数组的值，value存储值对应的个数
         */
        for (int i = 0; i < arr.length; i++) {
            /**
             * 如果map的key 存在这个值，则个数+1
             */
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        /**
         * 遍历值不为1的
         */
        for (Integer entry : map.keySet()) {
            if (map.get(entry) != 1) {
                System.out.println(entry);
            }
        }
    }
}