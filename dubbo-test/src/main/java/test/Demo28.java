/*
*  2018 
*/
package test;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.Set;

/**
 * @author wangdan Date: 2018/12/20 Time: 11:19
 * @version $Id$
 */
public class Demo28 {

    public static void main(String[] args) {
        List<String> listSeq = Lists.newArrayList("a","a","b","b");
        if (CollectionUtils.isEmpty(listSeq)) {
            return;
        }
        Set<String> setSeq = Sets.newHashSet(listSeq);
        if (CollectionUtils.isEmpty(setSeq)) {
            return;
        }
        System.out.println(setSeq);
    }
}