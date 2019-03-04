/*
*  2019 
*/
package test;

import common.User;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang3.time.DateUtils;

import java.util.Date;

/**
 * @author wangdan Date: 2019/2/19 Time: 16:27
 * @version $Id$
 */
public class Demo45 {


    public static void main(String[] args) {
        User user = new User();
        user.setGrade("123");
        user.setAge(11);
        user.setName("lucas");
        user.setBirth(new Date());
        User u = new User();
        try {
            BeanUtils.copyProperties(u, user);
            System.out.println(u);
        } catch (Exception e) {
            e.printStackTrace();
        }

        Date d = new Date();
        System.out.println(diff(d, DateUtils.addDays(d,10)));
    }


    public static int diff(Date startDate, Date endDate) {
        return (int) Math.ceil((endDate.getTime() - startDate.getTime()) / 86400000.0D);
    }
}