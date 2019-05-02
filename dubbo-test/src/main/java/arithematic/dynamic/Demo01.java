/*
*  2019 
*/
package arithematic.dynamic;

import arithematic.CommonUtils;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import java.util.List;
import java.util.Map;

/**
 * @author wangdan Date: 2019/5/2 Time: 10:08
 * @version $Id$
 */
public class Demo01 {

    public static int arr[][] = {{1, 2, 3, 4, 4, 5, 6, 7, 8, 9, 10}, {1, 5, 8, 9, 10, 17, 17, 20, 24, 30}};

    public static List<Integer> list = Lists.newArrayList();

    public static Map<Integer, List<Integer>> map = Maps.newHashMap();

    /**
     * 动态规划解决钢条切割问题
     */

    public static void main(String[] args) {
        int arr[] = f(10);
        CommonUtils.out(arr);
        System.out.println(map);
    }


    public static int[] f(int n) {
        int res[] = CommonUtils.init(n);

        if (n == 0) {
            return res;
        }
        res[1] = arr[1][0];
        if (n == 1) {
            return res;
        }
        for (int i = 2; i <= n; i++) {
            int temp = com(res, i);
            res[i] = temp;
        }
        return res;
    }

    public static int com(int res[], int k) {
        int m1 = 0;
        int m2 = 0;
        int max = 0;
        if (k <= arr[0].length) {
            max = arr[1][k - 1];
        }
        for (int i = 1; i <= k / 2; i++) {
            int temp = res[i] + res[k - i];
            if (temp > max) {
                m1 = i;
                m2 = k - i;
                max = temp;
            }
        }
        if (m1 == 0 && m2 == 0) {
            map.put(k, Lists.newArrayList(arr[0][k - 1]));
        }else{
           map.put(k,Lists.newArrayList(m1,m2));
        }
        return max;
    }


}