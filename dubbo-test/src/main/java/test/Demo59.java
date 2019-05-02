/*
*  2019 
*/
package test;

/**
 * @author wangdan Date: 2019/3/28 Time: 22:46
 * @version $Id$
 */
public class Demo59 {


    public static void main(String[] args) {
        new Demo59().reverse("123asdf");
    }


    public void get(String str) {
        if (str.length() == 0) {
            return;
        }

        char c[] = str.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (c[i] >= '0' &&  c[i] <= '9') {
                System.out.println(Integer.parseInt(c[i] + ""));
            }
        }
    }

    public String reverse(String str){
        return new StringBuffer(str).reverse().toString();
    }
}