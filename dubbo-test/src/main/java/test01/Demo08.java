/*
*  2019 
*/
package test01;

import java.util.Stack;

/**
 * @author wangdan Date: 2019/6/22 Time: 15:17
 * @version $Id$
 */
public class Demo08 {

    public static void main(String[] args) {
        Stack<Integer> stack =  new Stack<>();
        stack.push(1);
        System.out.println(stack.peek());
        stack.push(2);
        stack.push(3);
        System.out.println(stack.peek());
        stack.push(4);
        stack.push(5);
        System.out.println(stack.peek());

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }
}