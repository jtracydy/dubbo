/*
*  2019 
*/
package arithematic.niuke.n2;

import arithematic.niuke.TreeNode;
import com.google.common.collect.Maps;

import java.util.ArrayList;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author wangdan Date: 2019/5/11 Time: 09:27
 * @version $Id$
 */
public class Demo04 {


    /**
     * 二叉树和为某一路径
     *
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
        TreeNode t8 = new TreeNode(9);
        TreeNode t9 = new TreeNode(12);

        t1.left = t2;
        t1.right = t3;
        t2.left = t4;
        t2.right = t5;
        t3.left = t6;
        t3.right = t7;
        t4.right = t8;
        t5.left = t9;
        System.out.println(new Demo04().FindPath(t1, 36));

        Map<String, String> map = Maps.newHashMap();
        map.put("1", "1");
        ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.put("1", "1");
    }


    private ArrayList<ArrayList<Integer>> listAll = new ArrayList<>();
    private ArrayList<Integer> list = new ArrayList<>();

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        if (root == null) {
            return listAll;
        }
        list.add(root.val);
        target -= root.val;
        if (target == 0 && root.left == null && root.right == null) {
            listAll.add(new ArrayList<>(list));
        }
        FindPath(root.left, target);
        FindPath(root.right, target);
        list.remove(list.size() - 1);
        return listAll;
    }


//    public static void f(TreeNode root, int target) {
//        if (root == null) {
//            return;
//        }
//        if (root.left == null && root.right == null) {
//
//        }
//
//        Stack<TreeNode> stack = new Stack<>();
//        /**
//         * 0 左节点已经遍历，
//         */
//        Stack<Integer> flag = new Stack<>();
//        ArrayList<Integer> nodeList = new ArrayList<>();
//        ArrayList<ArrayList<Integer>> nodeRes = new ArrayList<>();
//        int f = -1;
//        int count = 0;
//        while (root != null || !stack.isEmpty()) {
//            if (root == null) {
//                root = stack.pop();
//                f = flag.pop();
//            }
//            if (f == -1) {
//                count = count + root.val;
//                nodeList.add(root.val);
//                stack.push(root);
//                flag.push(0);
//                root = root.left;
//            } else if (f == 0) {
//                int val = root.val;
//                root = root.right;
//                f = -1;
//                /**
//                 * 此节点为叶子节点
//                 */
//                if (root == null) {
//                    if (count == target) {
//                        nodeRes.add(nodeList);
//                    }
//                    count = count - val;
//                    nodeList.remove(nodeList.size() - 1);
//                }
//            }
//        }
//
//        System.out.println(nodeList);
//    }
}