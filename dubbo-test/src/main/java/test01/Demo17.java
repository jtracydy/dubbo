/*
*  2019 
*/
package test01;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wangdan Date: 2019/7/24 Time: 11:00
 * @version $Id$
 */
public class Demo17 {



    public static void main(String[] args) {
        final int a = 3;
        final String str = "final string";
        final List<String> list  = new ArrayList<>(1);

//        a = 4;
//        str = "aaa";
        list.add("aaa");
        list.add("bbb");
        System.out.println(list);

        List<String> lll  = new ArrayList<>(1);
    }
}