/*
*  2019 
*/
package test;


import org.apache.commons.lang.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wangdan Date: 2019/4/6 Time: 21:01
 * @version $Id$
 */
public class Demo64 {

    static Map<String, String> map = new HashMap<>();

    static Map<Integer, String> mapDay = new HashMap<>();



    static {
        map.put("1234567", "周一至周日");
        map.put("123456", "周一至周六");
        map.put("234567", "周二至周日");
        map.put("12345", "周一至周五");
        map.put("23456", "周二至周六");
        map.put("34567", "周三至周日");
        map.put("1234", "周一至周四");
        map.put("2345", "周二至周五");
        map.put("3456", "周三至周六");
        map.put("4567", "周四至周日");
        map.put("123", "周一至周三");
        map.put("234", "周二至周四");
        map.put("345", "周三至周五");
        map.put("456", "周四至周六");
        map.put("567", "周五至周日");

        mapDay.put(0, "周一");
        mapDay.put(1, "周二");
        mapDay.put(2, "周三");
        mapDay.put(3, "周四");
        mapDay.put(4, "周五");
        mapDay.put(5, "周六");
        mapDay.put(6, "周日");
    }

    public static void main(String[] args) {
        String str = "0001111";
        System.out.println(new Demo64().g(str));
//        String YES_MEAL= "提供%s早餐，早餐价格(%s)(%s)"+"\r\n"+"%s"+"早餐时间：%s";
//        System.out.println(String.format(YES_MEAL,"adadfadfadf","","","",""));

        StringBuilder sb = new StringBuilder("123");

        String sss = "123";
        System.out.println(sb.toString().equals(sss));

    }


    public String g(String aim) {
        if (StringUtils.isEmpty(aim)) {
            return null;
        }
        char c[] = aim.toCharArray();
        int len = aim.length() - 1;
        String res = f(c, 0, aim.length() - 1);
        if (res != null) {
            return res;
        }
        StringBuilder stringBuilder = new StringBuilder();
        String flag = "、";
        for (int i = 0; i <= len; i++) {
            if (c[i] == '1') {
                if (stringBuilder.length() != 0) {
                    stringBuilder.append(flag);
                }
                stringBuilder.append(mapDay.get(i));
            }
        }
        return stringBuilder.toString();
    }


    public String f(char c[], int from, int to) {
        if ((to - from) < 2) {
            return null;
        }
        String str = "";
        StringBuilder sb = new StringBuilder("");
        int temp = from;
        for (int i = from; i <= to; ) {
            if (c[i] == '1' && i == temp) {
                i++;
                sb.append(i);
                temp = i;
            } else {
                break;
            }
        }
        str = sb.toString();
        if (map.containsKey(str)) {
            return map.get(str);
        }
        return f(c, from + 1, to);
    }

}