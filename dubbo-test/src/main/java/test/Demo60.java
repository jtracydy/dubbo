/*
*  2019 
*/
package test;

import com.google.common.collect.Sets;

import java.util.HashSet;
import java.util.Set;

/**
 * @author wangdan Date: 2019/3/29 Time: 14:33
 * @version $Id$
 */
public class Demo60 {

    public static void main(String[] args) {
        Set<String> s1 = new HashSet();
        s1.add("1");
        s1.add("2");
        s1.add("3");

        Set<String> s2 = new HashSet();
        s2.add("4");
        s2.add("2");
        s2.add("3");
        Set<String> set = Sets.intersection(s1, s2);
        System.out.println(set);
    }
}