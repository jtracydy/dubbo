/*
*  2019 
*/
package arithematic.niuke.n1;

/**
 * @author wangdan Date: 2019/3/27 Time: 22:30
 * @version $Id$
 */
public class Demo09 {

    public static void main(String[] args) {
        System.out.println(new Demo09().JumpFloorII(3));
    }

    public int JumpFloorII(int target) {
        if(target == 0){
            return 0;
        }
        if(target == 1){
            return 1;
        }
        int arr[] = new int[target+1];
         arr[1] = 1;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = 2 * arr[i-1];
        }
        return arr[target];
    }
}