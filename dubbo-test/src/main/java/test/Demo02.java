package test;

import org.apache.commons.lang3.time.DateFormatUtils;
import org.joda.time.DateTime;

import java.util.Date;

public class Demo02 {

    public static void main(String[] args) {
        Date d = calcCheckDay(0,new Date());
        System.out.println(DateFormatUtils.format(d,"yyyy-MM-dd HH:mm:ss"));
    }

    public static Date calcCheckDay(Integer checkDay, Date checkout) {
        DateTime dateTime = new DateTime(checkout);
        DateTime sendTime = new DateTime(dateTime.getYear(), dateTime.getMonthOfYear(), dateTime.getDayOfMonth(), 0, 0,
                0);
        return sendTime.plusDays(checkDay).plusHours(checkDay).toDate();
    }
}
