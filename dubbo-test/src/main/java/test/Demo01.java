package test;

import com.google.common.base.Optional;
import org.joda.time.DateTime;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;

public class Demo01 {


    public static void main(String[] args) {

        Map<String,Object> map = new HashMap<String,Object>();
        map.put("feb"," 11");
        map.put("step"," 11");
        System.out.println();


        Optional<Object> fab = Optional.fromNullable(map.get("feb"));
        System.out.println(fab.get().toString());
        Optional<Object> step = Optional.fromNullable(map.get("step"));
        System.out.println(step.get().toString());


        System.out.println(StringUtils.equals("中国", "中国1"));
    }


    public Date calcCheckDay(Integer checkDay, Date checkout) {
        DateTime dateTime = new DateTime(checkout);
        DateTime sendTime = new DateTime(dateTime.getYear(), dateTime.getMonthOfYear(), dateTime.getDayOfMonth(), 0, 0,
                0);
        return sendTime.plusDays(checkDay).plusHours(checkDay).toDate();
    }
}
