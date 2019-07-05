/*
*  2019 
*/
package arithematic.niuke.n2;

/**
 * @author wangdan Date: 2019/5/18 Time: 10:34
 * @version $Id$
 */
public class Demo11 {


    /**
     * 丑数
     */

    public static void main(String[] args) {
        System.out.println(new Demo11().GetUglyNumber_Solution(10));
    }


    public int GetUglyNumber_Solution(int index) {
        if (index == 0) {
            return 0;
        }
        int dp[] = new int[index];
        dp[0] = 1;
        int a = 0, b = 0, c = 0;
        for (int i = 1; i < index; i++) {
            dp[i] = Math.min(dp[a] * 2, Math.min(dp[b] * 3, dp[c] * 5));
            if (dp[i] % 2 == 0) {
                a++;
            }
            if (dp[i] % 3 == 0) {
                b++;
            }
            if (dp[i] % 5 == 0) {
                c++;
            }
        }

        return dp[index - 1];
    }

}