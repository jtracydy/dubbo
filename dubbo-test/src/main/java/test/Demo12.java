package test;


import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

public class Demo12 {


    public static void main(String[] args) {
        String rType = "1";
        String tType = "1";

        Map<String, String> map = new HashMap<>();
        map.put("rType", rType);
        map.put("tType", tType);


        if(StringUtils.isNotEmpty(map.get("rType"))){
            System.out.println(Integer.parseInt(map.get("rType")));
        }

        if(StringUtils.isNotEmpty(map.get("tType"))){
            System.out.println(map.get("rType"));
        }




    }
}
