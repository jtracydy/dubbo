/*
*  2019 
*/
package arithematic.niuke.n3;

/**
 * @author wangdan Date: 2019/6/15 Time: 10:32
 * @version $Id$
 */
public class Demo11 {

    /**
     * 请实现一个函数用来匹配包括'.'和'*'的正则表达式。
     * 模式中的字符'.'表示任意一个字符，而'*'表示它前面的字符可以出现任意次（包含0次）
     * 在本题中，匹配是指字符串的所有字符匹配整个模式。
     * 例如，字符串"aaa"与模式"a.a"和"ab*ac*a"匹配，但是与"aa.a"和"ab*a"均不匹配
     */

    public static void main(String[] args) {
        System.out.println(new Demo11().match("a".toCharArray(), "ab*".toCharArray()));
    }

    public boolean match(char[] str, char[] pattern) {
        if (str.length == 0 && pattern.length == 0) {
            return true;
        }
        if (str.length == 0) {
            return f(pattern, 0);
        }
        if (pattern.length == 0) {
            return f(str, 0);
        }
        int m = 0;
        int n = 0;
        while (m < str.length && n < pattern.length) {
            if (str[m] == pattern[n]) {
                m++;
                n++;
                if (m < str.length && str[m] == '*') {
                    m++;
                }
                if (n < pattern.length && pattern[n] == '*') {
                    n++;
                }
            } else {
                if (str[m] == '.' || pattern[n] == '.') {
                    m++;
                    n++;
                    if (m < str.length && str[m] == '*') {
                        m++;
                    }
                    if (n < pattern.length && pattern[n] == '*') {
                        n++;
                    }
                } else {
                    if (m + 1 < str.length && str[m + 1] == '*') {
                        m = m + 2;
                    } else if (n + 1 < pattern.length && pattern[n + 1] == '*') {
                        n = n + 2;
                    } else {
                        return false;
                    }

                }
            }
        }
        if (m < str.length) {
            return f(str, m);
        }
        if (n < pattern.length) {
            return f(pattern, n);
        }
        return true;
    }

    public boolean f(char c[], int m) {
        if ((c.length - m) % 2 != 0) {
            return false;
        }
        while(m<c.length){
            if(m+1<c.length && c[m+1] !='*'){
                return false;
            }
        }

        return true;
    }

}