/*
* Copyright (c) 2018 Qunar.com. All Rights Reserved.
*/
package test;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Objects;

/**
 * @author wangdan Date: 2018/11/13 Time: 10:55
 * @version $Id$
 */
public class Demo21 {


    public static void main(String[] args) {

        HashMap<String, Double> scoreHashMap = new HashMap<>();

        double d0 = double2Decimal(double2Decimal((67 / (double) 5)) * double2Decimal((72 / (double) 2315)));
        System.out.println(d0);
        double d1 = double2Decimal(double2Decimal((11 / (double) 7)) * double2Decimal((18 / (double) 2315)));
        System.out.println(d1);
        double d2 = double2Decimal(double2Decimal((1133 / (double) 2)) * double2Decimal((1135 / (double) 2315)));
        System.out.println(d2);
        double d3 = double2Decimal(double2Decimal((416 / (double) 1)) * double2Decimal((417 / (double) 2315)));
        System.out.println(d3);
        double d4 = double2Decimal(double2Decimal((245 / (double) 5)) * double2Decimal(250 / (double) 2315));
        System.out.println(d4);
        double d5 = double2Decimal(double2Decimal((507 / (double) 3)) * double2Decimal((510 / (double) 2315)));
        System.out.println(d5);
        double d6 = double2Decimal(double2Decimal((634 / (double) 17)) * double2Decimal((651 / (double) 2315)));
        System.out.println(d6);
        double d7 = double2Decimal(double2Decimal((451 / (double) 2)) * double2Decimal((453 / (double) 2315)));
        System.out.println(d7);
        double d8 = double2Decimal(double2Decimal((18 / (double) 10)) * double2Decimal((28 / (double) 2315)));
        System.out.println(d8);
        double d9 = double2Decimal(double2Decimal((100 / (double) 100)) * double2Decimal((0 / (double) 2315)));
        System.out.println(d9);
        System.out.println(double2Decimal(d0 + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9));
        System.out.println("++++++++++++++++=");
        scoreHashMap.put("0", d0);
        scoreHashMap.put("1", d1);
        scoreHashMap.put("2", d2);
        scoreHashMap.put("3", d3);
        scoreHashMap.put("4", d4);
        scoreHashMap.put("5", d5);
        scoreHashMap.put("6", d6);
        scoreHashMap.put("7", d7);
        scoreHashMap.put("8", d8);
        //double d9 = (67 / 5) * (72 / 2315);
        double score = scoreHashMap.values().stream().filter(Objects::nonNull).reduce(0d, (x, y) -> x + y);
        System.out.println(score);
        System.out.println(new BigDecimal(score).floatValue());

        System.out.println(double2Decimal((2 / (double) 3) * (1 / (double) 9)));
        System.out.println(double2Decimal(2/(double)3) * double2Decimal(1/(double)9));
        System.out.println(double2Decimal(0.7115));
    }

    public static double double2Decimal(double num) {
        return new BigDecimal(num).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
    }
}