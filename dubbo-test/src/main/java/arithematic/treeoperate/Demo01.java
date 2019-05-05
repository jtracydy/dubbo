/*
*  2019 
*/
package arithematic.treeoperate;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author wangdan Date: 2019/3/30 Time: 10:18
 * @version $Id$
 */
public class Demo01 {

    static Stack<TreeNode> stack = new Stack();
    static Stack<Integer> flag = new Stack();

    static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(5);
        TreeNode t6 = new TreeNode(6);
        TreeNode t7 = new TreeNode(7);
        TreeNode t8 = new TreeNode(8);
        TreeNode t9 = new TreeNode(9);
        TreeNode t10 = new TreeNode(10);
        TreeNode t11 = new TreeNode(11);

        t1.lNode = t2;
        t1.rNode = t3;
        t2.lNode = t4;
        t2.rNode = t5;
        t3.lNode = t6;
        t3.rNode = t7;
        t5.lNode = t8;
        t5.rNode = t9;
        t9.lNode = t10;
        t9.rNode = t11;

        level(t1);
        level(t2);
    }

    public static void level(TreeNode treeNode) {
        List<TreeNode> level = new ArrayList<>();
        level.add(treeNode);
        while (level.size() != 0) {
            treeNode = level.remove(0);
            list.add(treeNode.value);
            if (treeNode.lNode != null) {
                level.add(treeNode.lNode);
            }
            if (treeNode.rNode != null) {
                level.add(treeNode.rNode);
            }
        }
        System.out.println(list);
    }

    /**
     * 后续遍历
     *
     * @param treeNode
     */
    public static void after(TreeNode treeNode) {
        while (treeNode != null || !stack.isEmpty()) {
            int r = 0;
            if (treeNode == null) {
                treeNode = stack.pop();
                r = flag.pop();
            }
            if (treeNode.lNode != null && r == 0) {
                stack.push(treeNode);
                flag.push(1);
                treeNode = treeNode.lNode;
            } else if (treeNode.rNode != null && r == 1) {
                stack.push(treeNode);
                flag.push(2);
                treeNode = treeNode.rNode;
            } else {
                list.add(treeNode.value);
                treeNode = null;
            }
        }
        System.out.println(list);
    }

    /**
     * 左右根
     * <p>
     * flag 存放当前节点是否遍历右子树
     *
     * @param treeNode
     */

    public static void inter(TreeNode treeNode) {
        while (treeNode != null || !stack.isEmpty()) {
            int r = 0;
            if (treeNode == null) {
                treeNode = stack.pop();
                r = flag.pop();
            }
            if (treeNode.lNode != null && r == 0) {
                stack.push(treeNode);
                flag.push(1);
                treeNode = treeNode.lNode;
            } else if (treeNode.rNode != null && r == 1) {
                list.add(treeNode.value);
                treeNode = treeNode.rNode;
            } else {
                list.add(treeNode.value);
                treeNode = null;
            }
        }

        System.out.println(list);
    }

    /**
     * 前序遍历
     *
     * @param treeNode
     */
    public static void before(TreeNode treeNode) {
        while (treeNode != null || !stack.isEmpty()) {
            int r = 0;
            if (treeNode == null) {
                treeNode = stack.pop();
                r = flag.pop();
            }
            if (treeNode.lNode != null && r == 0) {
                list.add(treeNode.value);
                stack.push(treeNode);
                flag.push(1);
                treeNode = treeNode.lNode;
            } else if (treeNode.rNode != null && r == 1) {
                treeNode = treeNode.rNode;
            } else {
                list.add(treeNode.value);
                treeNode = null;
            }
        }
        System.out.println(list);
    }


    public static void beforeSort(TreeNode treeNode) {
        if (treeNode == null) {
            return;
        }

        if (treeNode != null) {
            System.out.println(treeNode.value);
            beforeSort(treeNode.lNode);
            beforeSort(treeNode.rNode);
        }
    }
}