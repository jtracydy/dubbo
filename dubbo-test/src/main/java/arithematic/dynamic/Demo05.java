/*
*  2019 
*/
package arithematic.dynamic;

import arithematic.CommonUtils;

/**
 * @author wangdan Date: 2019/5/2 Time: 14:42
 * @version $Id$
 */
public class Demo05 {

    static int row = 7;
    static int col = 6;
    /**
     * LCS 最长公共子序列
     * -1 2
     * 1 0
     */
    private static int direct[][] = CommonUtils.init(row, col);

    private static int dp[][] = CommonUtils.init(row, col);

    public static void main(String[] args) {
        String str1 = "abcbdab";
        String str2 = "bdcaba";
        lcs(str1.toCharArray(), str2.toCharArray());
        System.out.println(dp[row][col]);

        outDirect(str1.toCharArray(), row, col);
    }

    public static void outDirect(char c[], int i, int j) {
        if (i == 0 || j == 0) {
            return;
        }
        if (direct[i][j] == 0) {
            System.out.println(c[i - 1]);
            outDirect(c, i - 1, j - 1);
        } else if (direct[i][j] == 2) {
            outDirect(c, i - 1, j);
        } else {
            outDirect(c, i, j - 1);
        }
    }

    public static void lcs(char c1[], char c2[]) {
        if (c1.length == 0 || c2.length == 0) {
            return;
        }
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if (c1[i - 1] == c2[j - 1]) {
                    direct[i][j] = 0;
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else if (dp[i - 1][j] >= dp[i][j - 1]) {
                    dp[i][j] = dp[i - 1][j];
                    direct[i][j] = 2;
                } else {
                    dp[i][j] = dp[i][j - 1];
                    direct[i][j] = 1;
                }
            }
        }
    }


}