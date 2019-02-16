/*
*  2019 
*/
package test_map;

import com.google.common.collect.Maps;

import java.util.Map;

/**
 * @author wangdan Date: 2019/1/31 Time: 15:08
 * @version $Id$
 */
public class Deal {

    public static Map<ReviewSyncStatus,Comment> map = Maps.newHashMap();

    {
        map.put(ReviewSyncStatus.NEED_DELETE, new Comment() {
            @Override
            void dealComent(String status, String value) {
                if(status.equals(ReviewSyncStatus.NEED_DELETE.getCode())){
                    System.out.println(status+" "+value);
                }
                else{
                    System.out.println(status);
                }
            }
        });
        map.put(ReviewSyncStatus.NEED_INSERT, new Comment() {
            @Override
            void dealComent(String status, String value) {
                if(status.equals(ReviewSyncStatus.NEED_INSERT.getCode())){
                    System.out.println(status+" "+value);
                }
                else{
                    System.out.println(status);
                }
            }
        });
        map.put(ReviewSyncStatus.NEED_UPDATE, new Comment() {
            @Override
            void dealComent(String status, String value) {
                if(status.equals(ReviewSyncStatus.NEED_INSERT.getCode())){
                    System.out.println(status+" "+value);
                }
                else{
                    System.out.println(status);
                }
            }
        });
    }


}