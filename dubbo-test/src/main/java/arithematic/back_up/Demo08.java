/*
*  2019 
*/
package arithematic.back_up;

/**
 * @author wangdan Date: 2019/5/1 Time: 14:38
 * @version $Id$
 */
public class Demo08 {

    /**
     * 回溯法

     */
    private int count = 0; // 解数量
    private int n; // 输入数据n
    private int[] a; // 解向量
    private int[] d; // 解状态

    /**
     * @param args
     */
    public static void main(String[] args) {
        //测试例子
        Demo08 na = new Demo08(4, 100);
        na.tryArrangement(1);

    }

    public Demo08(int _n, int maxNSize) {
        n = _n;
        a = new int[maxNSize];
        d = new int[maxNSize];
    }

    /**
     * 处理方法
     *
     * @param k
     */
    public void tryArrangement(int k) {
        for (int j = 1; j <= n; j++) { // 搜索解空间
            if (d[j] == 0) {
                a[k] = j;
                d[j] = 1;
            } else { // 表明j已用过
                continue;
            }

            if (k < n) { // 没搜索到底
                tryArrangement(k + 1);
            } else {
                count++;
                output(); // 输出解向量
            }
            d[a[k]] = 0; // 回溯
        }
    }

    /**
     * 输出解向量
     */
    private void output() {
        System.out.println("count = " + count);
        for (int j = 1; j <= n; j++) {
            System.out.print(a[j] + " ");
        }
        System.out.println("");
    }

}