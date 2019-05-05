/*
*  2019 
*/
package arithematic.niuke.n2;

import arithematic.niuke.TreeNode;
import java.util.ArrayList;
import java.util.List;

/**
 * @author wangdan Date: 2019/5/5 Time: 09:43
 * @version $Id$
 */
public class Demo02 {

    /**
     * 层次遍历
     * @param args
     */
    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(10);
        TreeNode t2 = new TreeNode(6);
        TreeNode t3 = new TreeNode(14);
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(8);
        TreeNode t6 = new TreeNode(12);
        TreeNode t7 = new TreeNode(16);

        t1.left= t2;
        t1.right = t3;
        t2.left = t4;
        t2.right = t5;
        t3.left = t6;
        t3.right = t7;

        System.out.println(PrintFromTopToBottom(t1));
    }

    public static ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        List<TreeNode> treeNodes = new ArrayList<>();
        if (treeNodes != null) {
            treeNodes.add(root);
        }
        f(res,treeNodes);
        return res;
    }

    public static void f(ArrayList<Integer> res, List<TreeNode> treeNodes) {
        if (treeNodes.size() == 0) {
            return;
        }
        List<TreeNode> temp = new ArrayList<>();
        for (TreeNode treeNode : treeNodes) {
            if (treeNode != null) {
                res.add(treeNode.val);
                temp.add(treeNode.left);
                temp.add(treeNode.right);
            } else {
                continue;
            }
        }

        f(res, temp);
    }
}