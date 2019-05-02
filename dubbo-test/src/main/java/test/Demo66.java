/*
*  2019 
*/
package test;

/**
 * @author wangdan Date: 2019/4/9 Time: 10:04
 * @version $Id$
 */
public class Demo66 {

    private MyListNode firstNode = null;


    public void del(String element) {
        if (firstNode == null) {
            return;
        }
        MyListNode aimNode = firstNode;
        /**
         * 如果第一个节点的值和给定值相等
         */
        if(aimNode.element == element){
            aimNode = aimNode.nextNode;
            firstNode = aimNode;
            return;
        }
        /**
         * 记录前一个节点
         */
        MyListNode preNode = aimNode;
        aimNode = aimNode.nextNode;
        while (aimNode != null) {
             if(aimNode.element == element){
                 /**
                  * 现在有节点 1 2， 3 4 5
                  * 删除3 就是 2节点的nextNode 指针，指向4节点
                  */
                 aimNode = aimNode.nextNode;
                 preNode.nextNode = aimNode;
             }else{
                 preNode = aimNode;
                 aimNode = aimNode.nextNode;
             }
        }
    }

    public static void main(String[] args) {
        MyListNode m1 = new MyListNode("1");
        MyListNode m2 = new MyListNode("2");
        MyListNode m3 = new MyListNode("3");
        MyListNode m4 = new MyListNode("4");
        MyListNode m5 = new MyListNode("5");
        m1.nextNode = m2;
        m2.nextNode = m3;
        m3.nextNode = m4;
        m4.nextNode = m5;

        while(m1 != null){
            System.out.println(m1.element);
            m1 = m1.nextNode;
        }
    }
}

class MyListNode {
    String element;
    MyListNode nextNode = null;

    public MyListNode(String element) {
        this.element = element;
    }
}