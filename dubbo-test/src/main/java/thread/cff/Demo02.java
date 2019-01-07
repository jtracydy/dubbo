/*
*  2019 
*/
package thread.cff;

import java.util.concurrent.Callable;

/**
 * @author wangdan Date: 2019/1/4 Time: 10:14
 * @version $Id$
 */
public class Demo02 {

    public static void main(String[] args) {

        try {
            new MyCallable().call();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}

class MyCallable implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum = sum + i;
        }
        return sum;
    }
}