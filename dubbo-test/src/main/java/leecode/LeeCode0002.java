/*
*  2019 
*/
package leecode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wangdan Date: 2019/8/25 Time: 09:23
 * @version $Id$
 */
public class LeeCode0002 {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l4 = new ListNode(9);
        ListNode l5 = new ListNode(9);
        l4.next = l5;

        ListNode ll = addTwoNumbers(l1, l4);
        while (ll != null) {
            System.out.println(ll.val);
            ll = ll.next;
        }
        System.out.println();
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (null == l1) {
            return l2;
        }
        if (null == l2) {
            return l1;
        }

        int f = 0;
        List<Integer> list = new ArrayList<>();
        while (null != l1 && null != l2) {
            int temp = l1.val + l2.val;
            if (f == 1) {
                temp++;
                f = 0;
            }
            if (temp >= 10) {
                temp = temp - 10;
                f = 1;
            }
            list.add(temp);
            l1 = l1.next;
            l2 = l2.next;
        }
        while (l1 != null) {
            int temp = l1.val + f;
            if (temp >= 10) {
                temp = temp - 10;
                f = 1;
            } else {
                f = 0;
            }
            list.add(temp);
            l1 = l1.next;
        }

        while (l2 != null) {
            int temp = l2.val + f;
            if (temp >= 10) {
                temp = temp - 10;
                f = 1;
            } else {
                f = 0;
            }
            list.add(temp);
            l2 = l2.next;
        }

        if (f == 1) {
            list.add(1);
        }

        ListNode head = new ListNode(-1);
        ListNode l = new ListNode(-1);
        head.next = l;
        for (int i : list) {
            ListNode temp = new ListNode(i);
            l.next = temp;
            l = l.next;
        }
        return head.next.next;
    }
}