/*
*  2019 
*/
package thread.tl;

import java.util.Arrays;

/**
 * @author wangdan Date: 2019/9/9 Time: 08:56
 * @version $Id$
 */
public class Demo04 {

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9,10};

        int  [] copy = Arrays.copyOf(arr,5);

        System.out.println(arr);
        System.out.println(copy+" "+copy.length);
    }
}