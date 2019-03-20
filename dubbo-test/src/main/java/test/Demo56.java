/*
*  2019 
*/
package test;

/**
 * @author wangdan Date: 2019/3/20 Time: 10:07
 * @version $Id$
 */
public class Demo56 {


    public Integer compare (String a,String b){
        if(a == null || a.equals("") || b == null || b.equals("")){
            //某个为空无法比较
            return 0;
        }
        if(a.equals(b)){
            return 0;
        }
        char ac[] = a.toCharArray();
        char bc[] = b.toCharArray();
        for (int i = 0; i < ac.length; i++) {
            if(ac[i] > bc [i]){
                return 1;
            }else if(ac[i] < bc [i]){
                return -1;
            }
        }
        if(ac.length > bc.length){
            return 1;
        }
        else if(ac.length < bc.length){
            return -1;
        }
        return 0;
    }
}