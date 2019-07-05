/*
*  2019 
*/
package arithematic.niuke.n3;

import arithematic.niuke.ListNode;

/**
 * @author wangdan Date: 2019/6/22 Time: 11:40
 * @version $Id$
 */
public class Demo14 {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(3);
        ListNode l5 = new ListNode(4);
        ListNode l6 = new ListNode(4);
        ListNode l7 = new ListNode(5);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;
        l6.next = l7;
//        System.out.println(deleteDuplication(l1).val);
         f(l1);
    }

    public static ListNode deleteDuplication(ListNode pHead) {
        if (pHead == null) {
            return null;
        }
        ListNode head  = new ListNode(0);
        head.next = pHead;
        ListNode resNode = head;
        ListNode resNode111 = pHead;
        while (pHead != null) {
            ListNode q = pHead.next;
            int f = 1;
            while (q != null && q.val == pHead.val) {
                f = 0;
                q = q.next;
            }
            if(f == 0){
                pHead = q;
                resNode.next = q;
            }else{
                pHead = pHead.next;
                resNode = resNode.next;
            }
        }
        return head.next;
    }

    public static void f(ListNode pHead) {
        ListNode head = new ListNode(0);
        head = pHead;
        pHead.next = pHead.next.next;
    }
}