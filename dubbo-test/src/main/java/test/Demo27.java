/*
*  2018 
*/
package test;

import common.User;

/**
 * @author wangdan Date: 2018/12/13 Time: 10:15
 * @version $Id$
 */
public class Demo27 {

    public static void main(String[] args) {

        User user = null;

        try {
            int a = 3/0;
        } catch (Exception e) {
            System.out.println("asdfasdf"+ user.getGrade() +e);
        }
    }
}