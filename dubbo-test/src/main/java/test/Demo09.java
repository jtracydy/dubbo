package test;

import com.alibaba.fastjson.JSON;

import java.util.HashMap;
import java.util.Map;

public class Demo09 {


    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("str","str");
        map.put("22","11");
        System.out.println(JSON.toJSONString(map));
    }
}
