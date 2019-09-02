/*
*  2019 
*/
package test01;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @author wangdan Date: 2019/8/26 Time: 09:44
 * @version $Id$
 */
public class Demo27 {

    public static void main(String[] args) {
        String str1 = null;
        String str2 = "123";
        System.out.println(str1 + str2);


        StringBuilder sb = new StringBuilder("123");
        sb.append(str1);
        System.out.println(sb);


        List<String> list = Lists.newArrayList();
        list.add("1");
        list.add("2");
        list.add("3");

        list.remove(1);

    }
}