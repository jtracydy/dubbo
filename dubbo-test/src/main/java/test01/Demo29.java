/*
*  2019 
*/
package test01;

import com.google.common.collect.Maps;

import java.util.Map;

/**
 * @author wangdan Date: 2019/9/8 Time: 12:10
 * @version $Id$
 */
public class Demo29 {

    private static final Map<String,String> map = Maps.newHashMap();

    static{
        map.put("1","1");
        map.put("2","2");
        map.put("3","3");
    }

    public static Map<String,String> getMap(){
        return map;
    }
}