/*
*  2019 
*/
package test;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import common.User;

/**
 * @author wangdan Date: 2019/1/14 Time: 16:32
 * @version $Id$
 */
public class Demo33 {

    public static void main(String[] args) {
        Multimap<String, User> firstLevel = ArrayListMultimap.create();
        User u1 = new User();
        u1.setAge(123);
        u1.setGrade("111");
        u1.setName("adfadf");
        User u2 = new User();
        u2.setAge(22);
        u2.setGrade("222");
        u2.setName("adadfzzzzz");
        firstLevel.put("a",u1);
        firstLevel.put("a",u2);

        System.out.println(firstLevel);

        System.out.println(firstLevel.get("a"));
    }
}