/*
*  2019 
*/
package thread.aqs;

import java.util.concurrent.locks.AbstractQueuedSynchronizer;

/**
 * @author wangdan Date: 2019/9/2 Time: 15:37
 * @version $Id$
 */
public class Demo01 implements java.io.Serializable {


    private static class ExclusiveLock extends AbstractQueuedSynchronizer {

        @Override
        public boolean tryAcquire(int acquires) {
            if (compareAndSetState(0, 1)) {
                setExclusiveOwnerThread(Thread.currentThread());
                return true;
            }
            return false;
        }

        @Override
        protected boolean tryRelease(int releases) {
            if (getState() == 0) {
                throw new IllegalMonitorStateException();
            }
            setExclusiveOwnerThread(null);
            setState(0);
            return true;
        }

        @Override
        protected boolean isHeldExclusively() {
            return getState() == 1;
        }
    }

    private final ExclusiveLock exclusiveLock = new ExclusiveLock();


    public void lock() {
        exclusiveLock.acquire(1);
    }

    public void unlock() {
        exclusiveLock.release(1);
    }

}