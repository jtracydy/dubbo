/*
*  2019 
*/
package test_map;

/**
 * @author wangdan Date: 2019/1/31 Time: 15:13
 * @version $Id$
 */
public class Test {

    public static void main(String[] args) {
        Deal deal = new Deal();
        System.out.println(Deal.map);
        Comment comment =Deal.map.get(ReviewSyncStatus.NEED_DELETE);
        comment.dealComent("333","3333");

    }
}