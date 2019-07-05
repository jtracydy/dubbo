/*
*  2019 
*/
package arithematic.niuke.n3;

/**
 * @author wangdan Date: 2019/6/2 Time: 10:06
 * @version $Id$
 */
public class Demo07 {

    /**
     * 写一个函数，求两个整数之和，要求在函数体内不得使用+、-、*、/四则运算符号。
     *
     * @param args
     */
    public static void main(String[] args) {

    }

    /**
     * n1 n2的过程相当于转移求和的过程，每次n1 与 n2 的和 都是一样的
     *
     * @param num1
     * @param num2
     * @return
     */
    public int Add(int num1, int num2) {
        while (num2 != 0) {
            int temp = num1 ^ num2;
            num2 = (num1 & num2) << 1;
            num1 = temp;
        }
        return num1;
    }
}