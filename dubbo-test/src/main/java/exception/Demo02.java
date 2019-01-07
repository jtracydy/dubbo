/*
*  2019 
*/
package exception;

/**
 * @author wangdan Date: 2019/1/4 Time: 14:56
 * @version $Id$
 */
public class Demo02 {

    /**
     * 异常的输出的轨迹，调用顺序的方向顺序,运行时异常处理的过程中，寻找合适的异常处理器，
     * 异常处理器是catch后面的异常类，当方法调用的过程中没有匹配的异常时，打印异常的路径。
     * @param args
     */
    public static void main(String[] args) {
            try{
                A.get1();
            }finally {

            }
    }
}
class A{
    public static void get1()  {
        B.get1();
    }
}class B{
    public static void get1() {
        C.get1();
    }
}class C{
    public static void get1(){
        throw new NullPointerException();
    }
}