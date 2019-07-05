/*
*  2019 
*/
package test01;

import java.util.concurrent.locks.AbstractQueuedSynchronizer;

/**
 * @author wangdan Date: 2019/6/13 Time: 15:47
 * @version $Id$
 */
public class Demo07 extends AbstractQueuedSynchronizer {
    @Override
    protected boolean tryAcquire(int arg) {
        return true;
    }


    @Override
    protected boolean tryRelease(int arg) {
        return true;
    }


    @Override
    protected int tryAcquireShared(int arg) {
        return 1;
    }

    @Override
    protected boolean tryReleaseShared(int arg) {
        return true;
    }

    @Override
    protected boolean isHeldExclusively() {
        return true;
    }

}