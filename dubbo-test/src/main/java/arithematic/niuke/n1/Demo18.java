/*
*  2019 
*/
package arithematic.niuke.n1;

import arithematic.niuke.TreeNode;

/**
 * @author wangdan Date: 2019/5/4 Time: 11:30
 * @version $Id$
 */
public class Demo18 {

    /**
     * 	二叉树的镜像
     * @param args
     */

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(8);
        TreeNode t2 = new TreeNode(6);
        TreeNode t3 = new TreeNode(10);
        TreeNode t4 = new TreeNode(5);
        TreeNode t5 = new TreeNode(7);
        TreeNode t6 = new TreeNode(9);
        TreeNode t7 = new TreeNode(11);

        t1.left= t2;
        t1.right = t3;
        t2.left = t4;
        t2.right = t5;
        t3.left = t6;
        t3.right = t7;

        Mirror(t1);
    }

    public static  void Mirror(TreeNode root) {
         if(root == null){
             return;
         }
         TreeNode left = root.left;
         TreeNode right = root.right;
         root.left = right;
         root.right = left;
         Mirror(root.left);
         Mirror(root.right);
    }
}