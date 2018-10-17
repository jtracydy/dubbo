/*
* Copyright (c) 2018 Qunar.com. All Rights Reserved.
*/
package iterable;

        import com.alibaba.fastjson.JSON;
        import common.CommonUtils;
        import common.User;

        import java.util.Iterator;
        import java.util.List;

/**
 * @author wangdan Date: 2018/10/16 Time: 20:06
 * @version $Id$
 */
public class Demo01 {

    public static void main(String[] args) {
        List<User> users = CommonUtils.getUserList();
        Iterator<User> iterable = users.iterator();
        System.out.println(JSON.toJSONString(iterable.next()));

//        while(iterable.hasNext()){
//            User user = iterable.next();
//            System.out.println(JSON.toJSONString(user));
//        }
    }
}