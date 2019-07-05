/*
*  2019 
*/
package arithematic.niuke.n2;

import arithematic.niuke.TreeNode;

/**
 * @author wangdan Date: 2019/5/19 Time: 11:20
 * @version $Id$
 */
public class Demo14 {

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(5);
        TreeNode t6 = new TreeNode(6);

        t1.left = t2;
//        t1.right = t3;
        t2.left = t4;
//        t2.right = t5;
        t4.left = t5;
        t5.left = t6;
        System.out.println(new Demo14().IsBalanced_Solution(t1));
    }

    public boolean IsBalanced_Solution(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (f(root) != -10) {
            return true;
        }
        return false;
    }

    public int f(TreeNode treeNode) {
        if (treeNode == null) {
            return 0;
        }
        int l = f(treeNode.left);
        int r = f(treeNode.right);
        return Math.abs(l - r) <= 1 ? (l > r ? l + 1 : r + 1) : -10;
    }
}