/*
*  2019 
*/
package arithematic.niuke.n1;

/**
 * @author wangdan Date: 2019/3/25 Time: 19:22
 * @version $Id$
 */
public class Demo01 {

    /**
     * 在一个二维数组中（每个一维数组的长度相同），
     * 每一行都按照从左到右递增的顺序排序，
     * 每一列都按照从上到下递增的顺序排序。
     * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
     */

    public static void main(String[] args) {
        Demo01 d = new Demo01();
        int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(d.method2(3, arr));
    }

    /**
     * 回溯法
     *
     * @param target
     * @param array
     * @return
     */
    public boolean Find(int target, int[][] array) {
        int len = array[0].length;
        for (int i = 0; i < len; i++) {
            if (deal(array, target, i)) {
                return true;
            }
        }
        return false;
    }

    private boolean deal(int arr[][], int target, int t) {
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            if (arr[i][t] == target) {
                return true;
            } else if (arr[i][t] > target) {
                return false;
            }
        }
        return false;
    }

    /**
     * 思路
     * 矩阵是有序的，从左下角来看，向上数字递减，向右数字递增，
     * 因此从左下角开始查找，当要查找数字比左下角数字大时。右移
     * 要查找数字比左下角数字小时，上移
     *
     * @param target
     * @param array
     * @return
     */
    public boolean method2(int target, int[][] array) {
        int i = array.length - 1;
        int j = 0;
        while (i >= 0 && j < array[0].length) {
            if (array[i][j] == target) {
                return true;
            } else if (array[i][j] > target) {
                i--;
            } else if (array[i][j] < target) {
                j++;
            }
        }
        return false;
    }
}