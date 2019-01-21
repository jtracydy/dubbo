/*
*  2019 
*/
package test;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;

import java.util.List;

/**
 * @author wangdan Date: 2019/1/21 Time: 10:28
 * @version $Id$
 */
public class Demo37 {

    public static void main(String[] args) {
        List<String> list  = Lists.newArrayList("a");

//        System.out.println(list);
//        list.remove("a");
//        System.out.println(list);


        System.out.println(Iterables.getOnlyElement(list));
    }
}