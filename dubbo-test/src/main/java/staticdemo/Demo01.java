/*
*  2019 
*/
package staticdemo;


import org.apache.commons.lang3.time.DateUtils;

import java.util.Date;

/**
 * @author wangdan Date: 2019/1/21 Time: 14:21
 * @version $Id$
 */
public class Demo01 {


    public static void get() {
        System.out.println("static get........");
    }

    public void get1() {
        System.out.println("static get........");
    }

    public static void main(String[] args) {


        int a = 10;
        if( (a+10) < 20){
            System.out.println("a");
        }

        System.out.println(a);


        float f = 10f;

        System.out.println(f / 3 * 3 / 3 );

        System.out.println(DateUtils.addDays(new Date(), -90));
    }
}