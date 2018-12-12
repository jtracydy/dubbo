/*
*  2018 
*/
package test;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.apache.commons.collections.CollectionUtils;
import org.joda.time.DateTime;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author wangdan Date: 2018/12/3 Time: 16:00
 * @version $Id$
 */
public class Demo25 {

    public static void main(String[] args) {
        Map<Integer, String> map = Maps.newHashMap();
        map.put(1,null);
        System.out.println(map);
        map.putIfAbsent(1,"1");
        System.out.println(map);


        System.out.println( new BigDecimal(2).floatValue());

        List<String> list = Lists.newArrayList();
        System.out.println(CollectionUtils.isNotEmpty(list));
        list.add("1");
        System.out.println(CollectionUtils.isNotEmpty(list));

        Date END_DATE = DateTime.parse("2018-11-01").toDate();
        System.out.println(END_DATE);

        System.out.println(5<3);
    }
}