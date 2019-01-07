/*
*  2019
*/
package exception;

/**
 * @author wangdan Date: 2019/1/4 Time: 14:12
 * @version $Id$
 */
public class Demo01 {

    public static void main(String[] args) {
        try {
            get1();
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("main finally");
        }
    }

    /**
     * catch中抛出的异常会将异常抛出的上层方法调用处。
     */
    public static void get1() {
        try {
            int c = 2 / 0;
        } catch (Exception e) {
            throw e;
        }
    }

    /**
     * return 之后异常依然会被抛出
     *
     * @throws Exception
     */
    public static void get2() throws Exception {
        int c = 2 / 0;
        return;
    }

    /**
     * 在finally中return 异常不会被跑出去
     *
     * @throws Exception
     */
    public static void get3() throws Exception {
        try {
            int c = 2 / 0;
        } finally {
            System.out.println("get3 finally");
            return;
        }
    }

    /**
     * try只是捕获了异常，如果没有catch异常，异常会被抛出到方法调用出
     * @throws Exception
     */
    public static void get4() throws Exception {
        try {
            int c = 2 / 0;
        } finally {
            System.out.println("get4 finally");
        }
    }

    /**
     * try捕获了异常，没有处理异常，所以异常也会抛出
     */
    public static void get5(){
        try {
            int c = 2 / 0;
        } finally {
            System.out.println("get5 finally");
        }
    }

    /**
     * catch中return 方法结束，异常不会被抛出,finally正常的执行
     * @throws Exception
     */
    public static void get6() throws Exception {
        try {
            int c = 2 / 0;
        } catch (Exception e) {
            System.out.println("get6 catch....");
            return;
        } finally {
            System.out.println("get finally");
            return;
        }
    }

    /**
     * 1 try catch的异常在当前方法中处理
     * 2 try catch throw的e 和 没有catch 在方法上throws的异常会被抛到调用该方法的位置进行处理
     * 3 方法内存在catch的，方法中的异常会在catch中处理，如果catch中存在return,异常不会抛出，方法结束，
     * 4 finally中存在return，会将该方法结束，并且异常不会抛出
     * 5 return 标识当前栈的结束
     *
     */
}