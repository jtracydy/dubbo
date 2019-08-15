/*
*  2019 
*/
package test01;

/**
 * @author wangdan Date: 2019/7/22 Time: 17:01
 * @version $Id$
 */
public class Demo13 {

    public static void main(String[] args) {
        System.out.println(f());
    }


    public static int f(){
        int i =1;
        try{
            int a = 3/0;
        }catch (Exception e){
            e.printStackTrace();
            i = 0;
            throw  new RuntimeException(e);
        }finally {
            return 33;
        }
    }
}