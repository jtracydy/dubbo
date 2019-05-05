/*
*  2019 
*/
package arithematic.niuke.n1;

import arithematic.niuke.ListNode;

import java.util.ArrayList;

/**
 * @author wangdan Date: 2019/3/26 Time: 12:22
 * @version $Id$
 */
public class Demo03 {

    /**
     * 输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。
     *
     * @param args
     */
    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);
        node.next = node1;
        node1.next = node2;
        node2.next = node3;
        System.out.println(new Demo03().printListFromTailToHead(node));
    }


    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<>();
        if (listNode == null) {
            return list;
        }
        int count = 0;
        while (listNode != null) {
            count++;
            list.add(listNode.val);
            listNode = listNode.next;
        }
        if (count == 0) {
            return list;
        }
        ArrayList<Integer> result = new ArrayList<>(count);
        for (int i = list.size() - 1; i >= 0; i--) {
            result.add(list.get(i));
        }
        return result;
    }


}

