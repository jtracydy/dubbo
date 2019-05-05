/*
*  2019 
*/
package arithematic.niuke.n1;

/**
 * @author wangdan Date: 2019/3/26 Time: 19:40
 * @version $Id$
 */
public class Demo08 {

    /**
     * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(new Demo08().JumpFloor(4));
    }

    public int JumpFloor(int target) {
        if (target == 1) {
            return 1;
        }
        if(target == 2)
        {
            return 2;
        }
        int arr[] = new int[target + 2];
        arr[1] = 1;
        arr[2] = 2;
        for (int i = 3; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[target];
    }
}