/*
*  2019 
*/
package arithematic.niuke.n3;

import java.util.LinkedList;

/**
 * @author wangdan Date: 2019/6/2 Time: 09:28
 * @version $Id$
 */
public class Demo05 {


    /**
     * 随机指定一个数m,让编号为0的小朋友开始报数。每次喊到m-1的那个小朋友要出列唱首歌,
     * 然后可以在礼品箱中任意的挑选礼物,并且不再回到圈中,从他的下一个小朋友开始,
     * 继续0...m-1报数....这样下去....直到剩下最后一个小朋友,可以不用表演,
     * 并且拿到牛客名贵的“名侦探柯南”典藏版(名额有限哦!!^_^)。请你试着想下,哪个小朋友会得到这份礼品呢？
     */

    public static void main(String[] args) {

    }

    /**
     * 该题目是约瑟夫环问题，主要就是构建整个过程，每次从删掉位置的下一个元素开始进行数数，
     * bt记录了每次删掉的元素位置，删掉位置由下一个位置顶替。
     * @param n
     * @param m
     * @return
     */
    public int LastRemaining_Solution(int n, int m) {

        if (m == 0 || n == 0) {
            return -1;
        }
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            linkedList.add(i);
        }
        int bt = 0;
        while (linkedList.size() > 1) {
            bt = (bt + m - 1) % linkedList.size();
            linkedList.remove(bt);
        }
        return linkedList.getFirst();
    }
}