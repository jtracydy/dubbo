/*
*  2019 
*/
package arithematic;

/**
 * @author wangdan Date: 2019/5/2 Time: 10:46
 * @version $Id$
 */
public class CommonUtils {

    public static int[] init(int n) {
        int res[] = new int[n + 1];
        for (int i = 0; i < n; i++) {
            res[i] = 0;
        }
        return res;
    }

    public static int[][] init(int n, int m) {
        int res[][] = new int[n + 1][m + 1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                res[i][j] = 0;
            }
        }
        return res;
    }

    public static void out(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public  void swap(char c[], int from, int to) {
        if (from == to) {
            return;
        }
        char temp = c[from];
        c[from] = c[to];
        c[to] = temp;
    }
}