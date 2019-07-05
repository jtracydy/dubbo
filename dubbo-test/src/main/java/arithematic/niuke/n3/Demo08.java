/*
*  2019 
*/
package arithematic.niuke.n3;


import java.util.HashMap;
import java.util.Map;

/**
 * @author wangdan Date: 2019/6/2 Time: 10:12
 * @version $Id$
 */
public class Demo08 {


    /**
     * 将一个字符串转换成一个整数(实现Integer.valueOf(string)的功能，但是string不符合数字要求时返回0)，
     * 要求不能使用字符串转换整数的库函数。 数值为0或者字符串不是一个合法的数值则返回0。
     */
    public static void main(String[] args) {


        System.out.println(new Demo08().StrToInt("-2147483648"));
    }

    /**
     * @param str
     * @return
     */
    public int StrToInt(String str) {
        if (str.length() == 0) {
            return 0;
        }
        char c[] = str.toCharArray();
        Map<Character, Integer> map = f();
        double res = 0;
        int flag = 0;
        for (int i = 0; i < c.length; i++) {
            if(c[i] == '+'){
                continue;
            }
            if(c[i] == '-'){
                flag = -1;
                continue;
            }
            if (map.containsKey(c[i])) {
                res = res + map.get(c[i]) * Math.pow(10, c.length - 1 - i);
            } else {
                return 0;
            }
        }
        if(flag == -1){
            if(new Double(res).equals(2.147483648E9)){
                return Integer.MIN_VALUE;
            }
           return  -new Double(res).intValue();
        }
        return new Double(res).intValue();
    }

    public Map<Character, Integer> f() {
        Map<Character, Integer> map = new HashMap<>();
        map.put('0', 0);
        map.put('1', 1);
        map.put('2', 2);
        map.put('3', 3);
        map.put('4', 4);
        map.put('5', 5);
        map.put('6', 6);
        map.put('7', 7);
        map.put('8', 8);
        map.put('9', 9);
        return map;
    }
}
