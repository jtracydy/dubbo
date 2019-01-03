/*
*  2018 
*/
package test;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wangdan Date: 2018/12/12 Time: 17:09
 * @version $Id$
 */
public class Demo26 {

    private static final String DEFAULT_SEPARATOR = "\n";

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("aa");
        list.add("aaa");
        list.add("aaaa");
        String str = StringUtils.join(list, DEFAULT_SEPARATOR);
        System.out.println(str);


    }
}