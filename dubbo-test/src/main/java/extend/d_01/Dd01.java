/*
* Copyright (c) 2018 Qunar.com. All Rights Reserved.
*/
package extend.d_01;

/**
 * @author wangdan Date: 2018/11/15 Time: 11:01
 * @version $Id$
 */
public class Dd01 {

    private static  Dd01 dd01 = new Dd01();

    static String  field  = "dd01f";
    private Dd01(){
        get();
    }

    public void get(){
        System.out.println("get.......");
    }
}