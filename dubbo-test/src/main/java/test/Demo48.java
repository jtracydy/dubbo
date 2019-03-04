/*
*  2019 
*/
package test;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @author wangdan Date: 2019/2/23 Time: 11:37
 * @version $Id$
 */
public class Demo48 {


    public static void main(String[] args) {

        List<String> str = Lists.newArrayList();
        for (int i = 0; i < 10; i++) {
            str.add(i+"");
        }
        List<List<String>> ss = Lists.partition(str, calculatePageCount(str.size(), 3));

        System.out.println(ss);
    }


    public static int calculatePageCount(long totalCount, int pageSize) {
        long totalPage = totalCount / pageSize;
        if (totalCount % pageSize > 0) {
            totalPage++;
        }
        return (int) totalPage;
    }

}