/*
*  2019 
*/
package arithematic.niuke.n1;


import arithematic.niuke.TreeNode;

/**
 * @author wangdan Date: 2019/5/3 Time: 12:18
 * @version $Id$
 */
public class Demo17 {

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(8);
        TreeNode t2 = new TreeNode(8);
        TreeNode t3 = new TreeNode(9);
        TreeNode t4 = new TreeNode(2);
        TreeNode t5 = new TreeNode(5);

        t1.left= t2;
        t2.left = t3;
        t3.right = t4;
        t4.right = t5;


        System.out.println( HasSubtree(t1,t2));
    }
    

    public  static boolean HasSubtree(TreeNode root1, TreeNode root2) {
        if (root1 == null || root2 == null) {
            return false;
        }
        StringBuilder sb1 =new StringBuilder("");
        StringBuilder sb2 =new StringBuilder("");
        before(root1,sb1);
        before(root2,sb2);
        return sb1.toString().contains(sb2.toString());
    }


    public  static void before(TreeNode treeNode,StringBuilder sb) {
        if(treeNode !=null){
            sb.append(treeNode.val);
            before(treeNode.left,sb);
            before(treeNode.right,sb);
        }
    }

}