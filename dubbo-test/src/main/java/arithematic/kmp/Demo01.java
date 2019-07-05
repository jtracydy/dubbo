/*
*  2019 
*/
package arithematic.kmp;

import arithematic.CommonUtils;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author wangdan Date: 2019/6/16 Time: 09:24
 * @version $Id$
 */
public class Demo01 {


    public static void main(String[] args) {

        int next[] = getNext("agctagcagctagctg");
        CommonUtils.out(next);
    }


    public static int[] getNext(String str) {
        int next[] = new int[str.length()];
        next[0] = -1;
        int i = 0, j = -1;
        char c[] = str.toCharArray();

        while (i != c.length - 1) {
            System.out.println(i + " " + j);
            //这里注意，i==0的时候实际上求的是next[1]的值，以此类推
            if (j == -1 || c[i] == c[j]) {
                ++i;
                ++j;
                next[i] = j;
            } else {
                j = next[j];
            }
        }
        return next;
    }
}