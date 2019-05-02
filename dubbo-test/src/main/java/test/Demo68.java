/*
*  2019 
*/
package test;

import java.text.DecimalFormat;
import java.text.ParseException;

/**
 * @author wangdan Date: 2019/4/10 Time: 13:47
 * @version $Id$
 */
public class Demo68 {

    public static void main(String[] args) throws ParseException {
        Double b2 = 123.0d;
        DecimalFormat decimalFormat = new DecimalFormat("#######.###");
        System.out.println(Double.parseDouble(decimalFormat.format(b2.doubleValue())));
    }


}

