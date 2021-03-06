/*
*  2019 
*/
package arithematic.niuke;

/**
 * @author wangdan Date: 2019/4/16 Time: 23:08
 * @version $Id$
 */


public class Solution {

    public static void main(String[] args) {
        int pre[] = {1, 2, 4, 7, 3, 5, 6, 8};
        int in[] = {4, 7, 2, 1, 5, 3, 8, 6};
        reConstructBinaryTree(pre, in);
    }

    public static TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        TreeNode root = reConstructBinaryTree(pre, 0, pre.length - 1, in, 0, in.length - 1);
        return root;
    }

    //前序遍历{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}
    private static TreeNode reConstructBinaryTree(int[] pre, int startPre, int endPre, int[] in, int startIn, int endIn) {

        if (startPre > endPre || startIn > endIn) {
            return null;
        }
        TreeNode root = new TreeNode(pre[startPre]);

        for (int i = startIn; i <= endIn; i++) {
            if (in[i] == pre[startPre]) {

                System.out.println((startPre + 1) + " " + (startPre + i - startIn) + " " + startIn + " " + (i - 1));
                root.left = reConstructBinaryTree(pre, startPre + 1, startPre + i - startIn, in, startIn, i - 1);
                System.out.println((i - startIn + startPre + 1) + " " + (endPre) + " " + i + 1 + " " + endIn);
                root.right = reConstructBinaryTree(pre, i - startIn + startPre + 1, endPre, in, i + 1, endIn);
                break;
            }
        }
        return root;
    }
}