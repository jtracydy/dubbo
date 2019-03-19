/*
*  2019 
*/
package arithematic.plaindrome;

import org.apache.commons.lang3.StringUtils;

/**
 * 回文子串 abba  abcba
 *
 * @author wangdan Date: 2019/3/15 Time: 20:12
 * @version $Id$
 */
public class Demo01 {

    public static void main(String[] args) {
        Demo01 d = new Demo01();
        System.out.println(d.getMaxLen("abcddca"));
    }

    public Integer getMaxLen(String aimStr) {
        if (StringUtils.isEmpty(aimStr)) {
            return 0;
        }
        int len = 1;
        char c[] = aimStr.toCharArray();
        if (c.length % 2 == 0) {
            StringBuffer ss = new StringBuffer("#");
            for (int i = 0; i < c.length; i++) {
                ss.append(c[i]);
                ss.append("#");
            }
            c = ss.toString().toCharArray();
        } else {
            StringBuffer ss = new StringBuffer();
            for (int i = 0; i < c.length - 1; i++) {
                ss.append(c[i]);
                ss.append("#");
            }
            ss.append(c[c.length - 1]);
            c = ss.toString().toCharArray();
        }
        for (int i = 0; i < c.length; i++) {
            int temp = deal(c, i);
            System.out.println("i = " + i + " temp=" + temp);
            if (temp > len) {
                len = temp;
            }
        }
        return len;
    }

    public Integer deal(char[] c, int index) {
        int start = index - 1;
        int end = index + 1;
        int res = 1;
        while (start >= 0 && end < c.length) {
            if (c[start] == c[end] && c[start] != '#') {
                res++;
            } else {
                break;
            }

            start--;
            end++;
        }
        return res;
    }

}