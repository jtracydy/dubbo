/*
*  2019 
*/
package pattern.iterat.own;

/**
 * @author wangdan Date: 2019/3/8 Time: 19:51
 * @version $Id$
 */
public class Test {

    public static void main(String[] args) {

        Itr<String> itr = new ItrImpl<>();
        itr.add("a");
        itr.add("b");
        itr.add("c");
        itr.add("d");

        DefIterator defIterator = itr.getIterator();
        while(defIterator.hasNext()){
            System.out.println(defIterator.next());
        }
    }
}