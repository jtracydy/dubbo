/*
*  2019 
*/
package test;

import com.google.common.collect.Maps;
import common.User;
import lombok.Data;

import java.util.Date;
import java.util.Map;

/**
 * @author wangdan Date: 2019/4/9 Time: 14:44
 * @version $Id$
 */
public class Demo67 {

    public static void main(String[] args) {
        Map<String, User> map = Maps.newHashMap();
        User user = new User();
        user.setName("lucas");
        user.setAge(123);
        user.setGrade("99");
        user.setBirth(new Date());
        Dd d = new Dd();
        d.setMap(map);
        map.put("1", user);
        System.out.println(d);
        deal(d);
        System.out.println(d);
    }

    public static void deal(Dd d){
        Map<String, User> map = d.getMap();
        User user = map.get("1");
        user.setAge(111111111);
        map.put("1",user);
    }

    @Data
    static class Dd{
        Map<String, User> map;
    }
}