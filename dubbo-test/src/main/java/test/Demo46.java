/*
*  2019 
*/
package test;

import java.math.BigDecimal;

/**
 * @author wangdan Date: 2019/2/21 Time: 10:39
 * @version $Id$
 */
public class Demo46 {

    public static void main(String[] args) {
        BigDecimal b = new BigDecimal(String.valueOf("100")).setScale(BigDecimal.ROUND_FLOOR,
                1);


        System.out.println(b);
    }
}