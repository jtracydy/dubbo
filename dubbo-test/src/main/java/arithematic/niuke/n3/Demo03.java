/*
*  2019 
*/
package arithematic.niuke.n3;

/**
 * @author wangdan Date: 2019/5/26 Time: 11:17
 * @version $Id$
 */
public class Demo03 {

    /**
     * 对于一个给定的字符序列S，请你把其循环左移K位后的序列输出。
     * 例如，字符序列S=”abcXYZdef”,要求输出循环左移3位后的结果，
     * 即“XYZdefabc”。是不是很简单？OK，搞定它！
     */
    public static void main(String[] args) {
        System.out.println(new Demo03().LeftRotateString("abcXYZdef",3));
    }

    public String LeftRotateString(String str, int n) {
        if (n == 0 || str.length() == 0) {
            return str;
        }
        if (str.length() == n) {
            return str;
        }
        if (n > str.length()) {
            n = n % str.length();
        }
        return str.substring(n) + str.substring(0, n);
    }
}