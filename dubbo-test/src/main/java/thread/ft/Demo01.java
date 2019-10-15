/*
*  2019 
*/
package thread.ft;

import java.util.concurrent.FutureTask;

/**
 * @author wangdan Date: 2019/10/6 Time: 11:00
 * @version $Id$
 */
public class Demo01 {

    private final FutureTask<String> futureTask = new FutureTask<>(() -> Thread.currentThread().getName());

    private Thread t = new Thread(futureTask);

    public void start() {
        t.start();
    }

    public String get() throws Exception{
        return futureTask.get();
    }
}