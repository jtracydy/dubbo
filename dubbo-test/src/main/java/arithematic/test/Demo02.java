/*
*  2019 
*/
package arithematic.test;

import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author wangdan Date: 2019/4/5 Time: 16:13
 * @version $Id$
 */
public class Demo02 {


    /**
     * 三元组排序
     *
     * @param args
     */
    public static void main(String[] args) {
        TripleNode t1 = new TripleNode(1, 2, 12);
        TripleNode t2 = new TripleNode(6, 4, -7);
        TripleNode t3 = new TripleNode(6, 1, 15);
        TripleNode t4 = new TripleNode(5, 2, 18);
        TripleNode t5 = new TripleNode(4, 3, 24);
        TripleNode t10 = new TripleNode(3, 6, 14);
        TripleNode t6 = new TripleNode(3, 1, -3);
        TripleNode t7 = new TripleNode(1, 2, 12);
        TripleNode t9 = new TripleNode(1, 3, 9);

        List<TripleNode> list = new ArrayList<>();
        list.add(t1);
        list.add(t2);
        list.add(t3);
        list.add(t4);
        list.add(t5);
        list.add(t6);
        list.add(t7);
        list.add(t9);
        list.add(t10);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }


}

@AllArgsConstructor
class TripleNode implements Comparable {
    private int row;
    private int col;
    private int value;

    @Override
    public int compareTo(Object o) {
        TripleNode tripleNode = (TripleNode) o;
        if (row > tripleNode.row) {
            return 1;
        } else if (row == tripleNode.row && col > tripleNode.col) {
            return 1;
        } else if (row == tripleNode.row && col == tripleNode.col) {
            return 0;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return "[" + row + " " + col + " " + value + "]";
    }


}