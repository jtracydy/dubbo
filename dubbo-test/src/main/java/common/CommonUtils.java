/*
* Copyright (c) 2018 Qunar.com. All Rights Reserved.
*/
package common;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @author wangdan Date: 2018/10/16 Time: 11:25
 * @version $Id$
 */
public class CommonUtils {


    public static List<User>  getUserList(){
        User u1 = new User();
        u1.setName("xiaoming");
        u1.setGrade("77");
        u1.setAge(22);
        User u2 = new User();
        u2.setName("xiaoming");
        u2.setGrade("76");
        u2.setAge(33);
        User u3 = new User();
        u3.setName("xiaoming");
        u3.setAge(15);
        u3.setGrade("79");
        List<User> userList = Lists.newArrayList(u1,u2,u3);

        return userList;
    }
}