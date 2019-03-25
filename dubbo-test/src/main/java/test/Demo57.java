/*
*  2019 
*/
package test;

import java.util.HashMap;
import java.util.Hashtable;

/**
 * @author wangdan Date: 2019/3/22 Time: 11:14
 * @version $Id$
 */
public class Demo57 {

    public static void main(String[] args) {
        Hashtable<String, String> hashtable = new Hashtable<>();
        hashtable.put("", "a");
        //hashtable.put("a",null);

        System.out.println(hashtable);

        HashMap<String, String> map = new HashMap<>();
        map.put(null, null);
//        map.put(null, "a");
        map.put("a", null);
        System.out.println(map);
    }
}