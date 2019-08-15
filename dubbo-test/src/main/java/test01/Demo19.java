/*
*  2019 
*/
package test01;

/**
 * @author wangdan Date: 2019/8/14 Time: 15:48
 * @version $Id$
 */
public class Demo19 {

    public static void main(String[] args) {

        Node<String,String> e = new Node<>(1,"1","1",null);
        Node<String,String> n1 = new Node<>(1,"2","2",null);
        Node<String,String> n2 = new Node<>(1,"3","3",null);
        Node<String,String> n3 = new Node<>(1,"4","4",null);
        Node<String,String> n4 = new Node<>(1,"5","5",null);
        e.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        TreeNode<String,String> hd = null, tl = null;
        do {
            TreeNode<String,String> p = new TreeNode<>(e.hash,e.getKey(),e.getValue(),null);
            if (tl == null){
                hd = p;
            }
            else {
                p.prev = tl;
                tl.next = p;
            }
            tl = p;
        } while ((e = e.next) != null);

        System.out.println(hd);
    }


    static final class TreeNode<K,V> extends Node<K, V> {
        TreeNode<K, V> parent;  // red-black tree links
        TreeNode<K, V> left;
        TreeNode<K, V> right;
        TreeNode<K, V> prev;    // needed to unlink next upon deletion
        boolean red;

        TreeNode(int hash, K key, V val, Node<K, V> next) {
            super(hash, key, val, next);
        }
    }
    static class Node<K, V> {
        final int hash;
        final K key;
        V value;
        Node<K, V> next;

        Node(int hash, K key, V value, Node<K, V> next) {
            this.hash = hash;
            this.key = key;
            this.value = value;
            this.next = next;
        }

        public final K getKey() {
            return key;
        }

        public final V getValue() {
            return value;
        }
    }
}