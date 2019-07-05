/*
*  2019 
*/
package arithematic.niuke.n3;

import java.util.HashSet;
import java.util.Set;

/**
 * @author wangdan Date: 2019/6/15 Time: 11:26
 * @version $Id$
 */
public class Demo12 {

    public static void main(String[] args) {
        Demo12 d = new Demo12();
        d.Insert('g');
        d.Insert('o');
        d.Insert('o');
        d.Insert('g');
        d.Insert('l');
        d.Insert('e');
        System.out.println(d.FirstAppearingOnce());

    }
    /**
     * 请实现一个函数用来找出字符流中第一个只出现一次的字符。例如，当从字符流中只读出前两个字符"go"时，第一个只出现一次的字符是"g"。
     * 当从该字符流中读出前六个字符“google"时，第一个只出现一次的字符是"l"。
     */

    StringBuilder sb = new StringBuilder();
    Set<Character> set = new HashSet<>();

    public void Insert(char ch) {
        if (set.contains(ch)) {
            char cc[] = sb.toString().toCharArray();
            StringBuilder temp = new StringBuilder();
            for (int i = 0; i < cc.length; i++) {
                if (cc[i] != ch) {
                    temp.append(cc[i]);
                }
            }
            sb = temp;
        } else {
            sb.append(ch);
            set.add(ch);
        }
    }

    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce() {
        return sb.length() == 0 ? '#' : sb.charAt(0);
    }
}