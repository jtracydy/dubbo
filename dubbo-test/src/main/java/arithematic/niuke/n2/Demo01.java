/*
*  2019 
*/
package arithematic.niuke.n2;

import java.util.Stack;

/**
 * @author wangdan Date: 2019/5/4 Time: 12:04
 * @version $Id$
 */
public class Demo01 {

    /**
     * 栈的压入和弹出顺序
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] pushA = {1};
        int[] popA = {1};
        System.out.println(IsPopOrder(pushA, popA));
    }

    public static boolean IsPopOrder(int[] pushA, int[] popA) {
        if (pushA.length == 0 && popA.length == 0) {
            return true;
        }
        if (pushA.length != popA.length) {
            return false;
        }
        int k = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < pushA.length && k < popA.length; ) {
            if (pushA[i] != popA[k]) {
                stack.push(pushA[i]);
                i++;
            } else {
                k++;
                i++;
                while (stack.size() != 0 && k < popA.length) {
                    if (stack.peek() == popA[k]) {
                        k++;
                        stack.pop();
                    } else {
                        break;
                    }
                }
            }
        }
        if (stack.size() == 0 && k == popA.length) {
            return true;
        }
        return false;
    }

}