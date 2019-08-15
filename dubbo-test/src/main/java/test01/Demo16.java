/*
*  2019 
*/
package test01;

/**
 * @author wangdan Date: 2019/7/24 Time: 10:51
 * @version $Id$
 */
public class Demo16 {

    public static void main(String[] args) {
        String str = "I love java";
        String str1 = str;

        System.out.println("after replace str:" + str.replace("java", "Java"));
        System.out.println("after replace str1:" + str1);
        System.out.println(str == str1);
    }
}