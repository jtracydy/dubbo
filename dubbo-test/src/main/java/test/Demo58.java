/*
*  2019 
*/
package test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wangdan Date: 2019/3/26 Time: 12:42
 * @version $Id$
 */
public class Demo58 {


    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(4);
        list.add(0,1);
        list.add(0,2);
        list.add(0,3);
        list.add(0,4);
        System.out.println(list);


        /**
         * list add 指定位置的index>list.size(),
         */
        List<Integer> res = new ArrayList<>(4);
        System.out.println(res.size());
        res.add(3,4);
        System.out.println();
    }
}