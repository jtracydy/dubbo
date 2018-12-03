/*
* Copyright (c) 2018 Qunar.com. All Rights Reserved.
*/
package test;

import common.CommonUtils;
import common.User;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/**
 * @author wangdan Date: 2018/10/25 Time: 17:47
 * @version $Id$
 */
public class Demo20 {


        public static void main(String[] args) {
            HashMap<String, Double> scoreHashMap = new HashMap<>();
            scoreHashMap.put("h1",0.88);
            scoreHashMap.put("h2",0.77);
            scoreHashMap.put("h3",0.77);
            double score = scoreHashMap.values().stream().filter(Objects::nonNull).reduce(0d,(x,y) -> x+y);
            System.out.println(new BigDecimal(score).floatValue());


            List<User> userList = CommonUtils.getUserList();
            Iterator<User> it =  userList.iterator();
            while(it.hasNext()){
                System.out.println(it.next().getAge());
            }
        }

}