/*
*  2019 
*/
package stableObj;

import com.google.common.collect.ImmutableList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author wangdan Date: 2019/7/24 Time: 11:15
 * @version $Id$
 */
public class Demo01 {


    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        System.out.println(list);

        List unmodifiableList = Collections.unmodifiableList(list);
        ImmutableList immutableList = ImmutableList.copyOf(list);

        list.add(2);
        System.out.println(unmodifiableList);
        System.out.println(immutableList);
    }
}