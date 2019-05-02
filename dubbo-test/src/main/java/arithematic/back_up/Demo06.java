/*
*  2019 
*/
package arithematic.back_up;

/**
 * @author wangdan Date: 2019/5/1 Time: 13:43
 * @version $Id$
 */
public class Demo06 {

    private static int res[] = {0, 0, 0, 0, 0, 0, 0, 0};
    static int count = 8;
    static int total = 0;
    /**
     * 八皇后
     *
     * @param args
     */
    public static void main(String[] args) {
        f(0);
        System.out.println(total);
    }

    public static void f(int row) {
        if (count == row) {
            out(res);
            total++;
            return;
        }

        for (int i = 0; i < res.length; i++) {
            if (isOK(row, i)) {
                res[row] = i;
                f(row + 1);
            }
        }
    }

    public static boolean isOK(int row, int col) {
        for (int i = 0; i < row; i++) {
            if (i - res[i] == row - col || i + res[i] == row + col ){
                return false;
            }
            if(row == i || col == res[i]){
                return false;
            }
        }
        return true;
    }

    public static void out(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(res[i] + "-");
        }
        System.out.println();
    }
}