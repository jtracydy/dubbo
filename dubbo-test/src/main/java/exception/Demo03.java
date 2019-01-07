/*
*  2019 
*/
package exception;

import java.io.IOException;

/**
 * @author wangdan Date: 2019/1/4 Time: 14:59
 * @version $Id$
 */
public class Demo03 {

    public static void main(String[] args) {
        //get1();
        get2();
    }

    /**
     * 编译异常 需要处理，否则编译不通过
     * @throws IOException
     */
    public static void get1() throws IOException{

    }

    /**
     * 运行时异常不需要处理
     * @throws RuntimeException
     */
    public static void get2() throws  RuntimeException{
    }
}