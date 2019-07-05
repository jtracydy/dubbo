/*
*  2019 
*/
package arithematic.niuke.n3;

import arithematic.niuke.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author wangdan Date: 2019/6/22 Time: 11:33
 * @version $Id$
 */
public class Demo13 {


    public ListNode EntryNodeOfLoop(ListNode pHead) {
        if(pHead == null){
            return null;
        }
        Set<Integer> set = new HashSet<>();
        while (pHead != null) {
            if(set.contains(pHead.val)){
                return pHead;
            }else{
                set.add(pHead.val);
                pHead = pHead.next;
            }
        }
        return null;
    }
}