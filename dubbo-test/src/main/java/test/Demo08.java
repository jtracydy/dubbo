package test;

import com.google.common.collect.Lists;
import lombok.Data;
import org.apache.commons.lang3.time.DateUtils;

import java.util.Date;
import java.util.List;

public class Demo08 {

    public static void main(String[] args) {
        Per p = new Per();
        p.setName("xiaoming");
        p.setAge("65");
        p.setCreateTime(DateUtils.addDays(new Date(), 1));
        Per p1 = new Per();
        p1.setName("xiaozhang");
        p1.setAge("77");
        p1.setCreateTime(new Date());
        Per p2 = new Per();
        p2.setName("xiaoli");
        p2.setAge("85");
        p2.setCreateTime(DateUtils.addDays(new Date(), 3));
        Per p3 = new Per();
        p3.setName("xiaohong");
        p3.setAge("85");
        p3.setCreateTime(DateUtils.addDays(new Date(), 2));


        List<Per> ps = Lists.newArrayList();
        ps.add(p);
        ps.add(p1);
        ps.add(p2);
        ps.add(p3);
        ps.forEach(f -> System.out.println(f.getName() + " " + f.getCreateTime()));

        ps.stream().sorted((f1, f2) -> f1.getCreateTime().compareTo(f2.getCreateTime())).forEach(f -> System.out.println(f.getName() + " " + f.getCreateTime()));

    }

}

@Data
class Per {
    private String name;
    private String age;
    private Date createTime;
}