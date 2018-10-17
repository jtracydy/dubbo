/*
* Copyright (c) 2018 Qunar.com. All Rights Reserved.
*/
package test;

import common.CommonUtils;
import common.User;

import java.util.List;

/**
 * @author wangdan Date: 2018/10/16 Time: 11:25
 * @version $Id$
 */
public class Demo19 {

    public static void main(String[] args) {
        List<User> list = CommonUtils.getUserList();

        String id = list.stream().map(User::getName).reduce((o1, o2) -> o1.length() > o2.length() ? o1 : o2).orElse("11");
        System.out.println(id);
    }
}