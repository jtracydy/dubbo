/*
*  2019 
*/
package test;

import com.google.common.collect.Lists;
import org.apache.commons.lang.StringUtils;

import java.util.List;

/**
 * @author wangdan Date: 2019/3/6 Time: 19:01
 * @version $Id$
 */
public class Demo53 {

    public static void main(String[] args) {
        List<String> list = null;

        System.out.println(list.contains(""));

        System.out.println(StringUtils.equals("",null));
    }
}