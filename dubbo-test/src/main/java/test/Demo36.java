/*
*  2019 
*/
package test;

import org.apache.commons.lang3.time.DateUtils;
import org.joda.time.DateTime;

import java.util.Date;

/**
 * @author wangdan Date: 2019/1/18 Time: 11:08
 * @version $Id$
 */
public class Demo36 {

    public static void main(String[] args) {
//        DateTime end = DateTime.parse("2019-01-16");
//        DateTime start = end.minusDays(1);
//        System.out.println(end);
//        System.out.println(start);

        Date now = new Date();
        Date data = DateUtils.addDays(now, -90);

        System.out.println(now.compareTo(data));
        System.out.println(data);

        System.out.println(1<<3);
    }
}