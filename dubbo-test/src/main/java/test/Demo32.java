/*
*  2019 
*/
package test;

import com.alibaba.fastjson.JSON;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wangdan Date: 2019/1/9 Time: 17:49
 * @version $Id$
 */
public class Demo32 {

    public static void main(String[] args) {
        TestDemo01 testDemo01 = new TestDemo01();
    }
}

class TestDemo01{
    final Map<String,String> map = new HashMap<>();

    {
        map.put("a","a");
        map.put("b","b");
        map.put("c","c");
        map.put("d","d");
        System.out.println(JSON.toJSONString(map));
    }
    public TestDemo01(){
        System.out.println("TestDemo01...");
    }
}