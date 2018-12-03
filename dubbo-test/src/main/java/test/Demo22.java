/*
* Copyright (c) 2018 Qunar.com. All Rights Reserved.
*/
package test;

/**
 * @author wangdan Date: 2018/11/20 Time: 15:15
 * @version $Id$
 */
public class Demo22 {

    public static void main(String[] args) {
        
        int page = 100;

        int totalPage = 0;
        if( page !=0 && page % 50 == 0){
            totalPage = page/50;
        }else{
            totalPage = page/50+1;
        }
        System.out.println(totalPage);
    }
}