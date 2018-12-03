/*
*  2018 
*/
package test;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Maps;
import org.apache.commons.lang3.time.DateUtils;

import java.text.ParseException;
import java.util.Date;
import java.util.Map;

/**
 * @author wangdan Date: 2018/11/27 Time: 15:37
 * @version $Id$
 */
public class Demo23 {

    public static final String END_DATE = "2017-01-01 00:00:00";

    public static final String DATE_PLATFORM = "yyyy-MM-dd HH:mm:ss";

    public static void main(String[] args) throws ParseException {
        Date d = DateUtils.parseDate(END_DATE,DATE_PLATFORM);
        System.out.println(d.before(new Date()));


        Map<String,Object> map = Maps.newHashMap();

        try {
            map.put("a",null);
            map.put("b",null);
            map.put("c",null);
            map.put("d",null);
            System.out.println(map.get("a"));
            System.out.println(map.get("b"));
            System.out.println(map.get("c"));
        }
        catch (Exception e){
            System.out.println(e);
        }
        System.out.println(JSON.toJSONString(map));

        Map<String,Object> map2 = Maps.newHashMap();
        map2.put("a","a");
        map2.put("b","b");
        map2.put("c","c");
        System.out.println(JSON.toJSONString(map2));


        String str1 = "hello";
        String str2 = "你好";

        System.out.println("utf-8编码下'hello'所占的字节数:" + str1.length());
        System.out.println("gbk编码下'hello'所占的字节数:" + str1.length());

        System.out.println("utf-8编码下'你好abc'所占的字节数:" + str2.length());
        System.out.println("gbk编码下你好'你好abc'所占的字节数:" + str2.length());
    }
}