/*
*  2019 
*/
package leecode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wangdan Date: 2019/9/1 Time: 08:52
 * @version $Id$
 */
public class LeeCode0003 {

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("ggububgvfk"));
    }


    public static int lengthOfLongestSubstring(String s) {
        if (null == s || "".equals(s)) {
            return 0;
        }
        if (s.length() == 1) {
            return 1;
        }
        int len = 0;
        int max = Integer.MIN_VALUE;

        int k = 0;
        Map<Character, Integer> map = new HashMap<>();
        while (k < s.length()) {
            if (map.containsKey(s.charAt(k))) {
                if (len >= max) {
                    max = len;
                }
                len = 0;
                k = map.get(s.charAt(k));
                map = new HashMap<>();
            } else {
                len++;
                map.put(s.charAt(k), k);
            }

            k++;
        }

        if (len >= max) {
            max = len;
        }

        return max;
    }
}