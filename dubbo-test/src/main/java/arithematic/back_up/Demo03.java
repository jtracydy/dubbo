/*
*  2019 
*/
package arithematic.back_up;

import com.google.common.collect.Lists;
import org.apache.commons.collections.CollectionUtils;

import java.util.List;

/**
 * @author wangdan Date: 2019/5/1 Time: 10:12
 * @version $Id$
 */
public class Demo03 {

    public static void main(String[] args) {
        f(0, Lists.newArrayList("1", "2", "3"), Lists.newArrayList());
    }

    public static void f(int m, List<String> a, List<String> b) {
        if (CollectionUtils.isEmpty(a)) {
            return;
        }
        if (m > a.size() - 1) {
            System.out.println(b);
            return;
        }
        String x = a.get(m);
        b.add(x);
        System.out.println("m=" + m + " x=" + x + " lista=" + a + " listb=" + b);

        f(m + 1, a, b);
        b.remove(x);
        f(m + 1, a, b);
    }
}