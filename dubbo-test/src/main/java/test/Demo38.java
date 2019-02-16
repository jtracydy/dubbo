/*
*  2019 
*/
package test;

import com.google.common.collect.Lists;
import lombok.Builder;
import lombok.Data;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.time.DateUtils;

import java.util.Date;
import java.util.List;

/**
 * @author wangdan Date: 2019/1/26 Time: 12:36
 * @version $Id$
 */
public class Demo38 {


    public static void main(String[] args) {
//        Date date = new Date();
//        System.out.println(date);
//        System.out.println( DateUtils.addDays(date, -90));

        List<String> list = Lists.newArrayList();
        list.add("a");
        if(CollectionUtils.isNotEmpty(list)){
            System.out.println(list.get(0));
        }else{
            System.out.println("......");
        }

        AA  a = AA.builder().source(true).build();
        System.out.println(a.isSource());
    }
}

@Builder
@Data
class AA {
    private boolean source;

    public AA(boolean source) {
        this.source = source;
    }
}