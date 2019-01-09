/*
*  2019 
*/
package test;

import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.joda.time.DateTime;

import java.util.Date;

/**
 * @author wangdan Date: 2019/1/7 Time: 14:40
 * @version $Id$
 */
public class Demo31 {


    public static void main(String[] args) {
        String plat = "yyyy-MM-dd";

        Date now = DateTime.parse(DateFormatUtils.format(new Date(), plat)).toDate();
        Date from = DateUtils.addDays(now, -8);

        Date END_DATE = DateTime.parse("2019-01-08").toDate();

        if (END_DATE.after(from) && END_DATE.before(now)) {
            System.out.println(END_DATE);
        } else {
            System.out.println("outer.....");
        }
        System.out.println("now="+now);
        System.out.println("from="+from);
    }
}