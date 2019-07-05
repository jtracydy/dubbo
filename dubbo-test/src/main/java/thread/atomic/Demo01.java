/*
*  2019 
*/
package thread.atomic;

import common.User;

import java.util.Date;
import java.util.concurrent.atomic.AtomicReference;

/**
 * @author wangdan Date: 2019/5/13 Time: 14:51
 * @version $Id$
 */
public class Demo01 {

    public static void main(String[] args) {

        AtomicReference<User> atomicReference = new AtomicReference<>();
        User uu  = new User();
        uu.setAge(11);
        uu.setBirth(new Date());
        atomicReference.set(uu);
        User user = atomicReference.get();
        System.out.println(user.getAge());
    }
}