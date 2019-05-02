/*
*  2019 
*/
package arithematic.recursion;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wangdan Date: 2019/3/30 Time: 20:12
 * @version $Id$
 */
public class Demo01 {

    private static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        hanio(5, "x", "y", "z");
        System.out.println();
    }

    /**
     * @param n 数字
     * @param x 起始塔
     * @param y 辅助塔
     * @param z 目标塔
     */
    public static void hanio(int n, String x, String y, String z) {
        if (n == 1) {
            move(x, 1, z);
        } else {
            hanio(n - 1, x, z, y);
            move(x, n, z);
            hanio(n - 1, y, x, z);
        }
    }

    public static void move(String x, int n, String z) {
        System.out.println(n + " 从 " + x + " 移动到 " + z);
    }
}