/*
*  2019 
*/
package arithematic.niuke;

import java.util.Stack;

/**
 * @author wangdan Date: 2019/3/26 Time: 12:48
 * @version $Id$
 */
public class Demo05 {
    /**
     * 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
     */

    public static void main(String[] args) {
        Demo05 d = new Demo05();
        d.push(1);
        d.push(2);
        d.push(3);

        System.out.println(d.pop());
        System.out.println(d.pop());
        d.push(4);
        System.out.println(d.pop());
        d.push(5);
        System.out.println(d.pop());
        System.out.println(d.pop());
    }

    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if (stack2.size() == 0) {
            while (stack1.size() != 0) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
}