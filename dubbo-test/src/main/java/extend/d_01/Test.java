/*
* Copyright (c) 2018 Qunar.com. All Rights Reserved.
*/
package extend.d_01;

import extend.d_02.Son1;

/**
 * @author wangdan Date: 2018/11/15 Time: 11:03
 * @version $Id$
 */
public class Test {

    public static void main(String[] args) {
        System.out.println(Dd01.field);

        /**
         * protected 和 default方法无法访问
         */
        Son1 s1 = new Son1();
    }
}