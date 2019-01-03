/*
*  2018 
*/
package test;

/**
 * @author wangdan Date: 2018/12/21 Time: 19:53
 * @version $Id$
 */
public class Demo29 {


    public static void main(String[] args) {



        boolean b = isPunct('a');
        System.out.println(b);
    }


    public static boolean isPunct(char ch) {
        if (ch == '-' || ch == '/') {
            return false;
        }
        if (ch >= 32 && ch <= 127 && ch != ' ' && !Character.isLetterOrDigit(ch)) {
            return true;
        }
        Character.UnicodeBlock ub = Character.UnicodeBlock.of(ch);
        return ub == Character.UnicodeBlock.GENERAL_PUNCTUATION
                || ub == Character.UnicodeBlock.CJK_SYMBOLS_AND_PUNCTUATION;
    }
}