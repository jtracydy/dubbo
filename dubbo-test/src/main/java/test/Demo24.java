/*
*  2018 
*/
package test;

import org.apache.commons.lang3.time.DateUtils;
import org.joda.time.DateTime;

import java.text.ParseException;
import java.util.Date;

/**
 * @author wangdan Date: 2018/11/28 Time: 21:03
 * @version $Id$
 */
public class Demo24 {

    public static final String END_DATE = "2018-12-20 00:00:00";

    public static final String DATE_PLATFORM = "yyyy-MM-dd HH:mm:ss";

    public static void main(String[] args) throws ParseException {
        DateTime end = DateTime.now().withTime(0, 0, 0, 0);
        DateTime start = end.minusDays(20);

        System.out.println(end);
        System.out.println(start);

        /**
         * 如果时间在12.20号之后输出a  否则输出b
         */
        boolean b = new Date().after(DateUtils.parseDate(END_DATE, DATE_PLATFORM));
        if (b) {
            System.out.println("a");
        } else {
            System.out.println("b");
        }

        System.out.println(b);
    }
}