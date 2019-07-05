/*
*  2019 
*/
package arithematic.niuke.n3;

/**
 * @author wangdan Date: 2019/6/2 Time: 09:43
 * @version $Id$
 */
public class Demo06 {


    /**
     * 求1+2+3+...+n，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）
     */
    public static void main(String[] args) {

    }

    /**
     *1.需利用逻辑与的短路特性实现递归终止。
     * 2.当n==0时，(n>0)&&((sum+=Sum_Solution(n-1))>0)只执行前面的判断，为false，然后直接返回0；
     * 3.当n>0时，执行sum+=Sum_Solution(n-1)，实现递归计算Sum_Solution(n)。
     * @param n
     * @return
     */
    public int Sum_Solution(int n) {
        return 1;
    }
}