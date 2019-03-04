/*
*  2019 
*/
package test;

import com.google.common.collect.MapDifference;
import com.google.common.collect.Maps;

import java.util.Map;

/**
 * @author wangdan Date: 2019/2/22 Time: 14:13
 * @version $Id$
 */
public class Demo47 {

    public static void main(String[] args) {
        Map<String,String> m1  = Maps.newHashMap();
        m1.put("a","a");
        m1.put("b","b");
        m1.put("c","c");

        Map<String,String> m2  = Maps.newHashMap();
        m2.put("a","aa");
        m2.put("b","b");
        m2.put("d","d");

        MapDifference<String,String> diff = Maps.difference(m1,m2);

        /**
         * 右面有的左面没有
         */
        System.out.println(diff.entriesOnlyOnRight());
        System.out.println(diff.entriesOnlyOnLeft());

    }
}