/*
*  2019 
*/
package thread.aqs;

import java.util.concurrent.locks.AbstractQueuedSynchronizer;

/**
 * @author wangdan Date: 2019/9/2 Time: 16:28
 * @version $Id$
 */
public class Demo02 {

    private final ShareLock shareLock ;

    public Demo02(int count) {
        shareLock = new ShareLock(count);
    }

    private static class ShareLock extends AbstractQueuedSynchronizer {

        public ShareLock(int count) {
            setState(count);
        }

        @Override
        public int tryAcquireShared(int interval) {
            for (; ; ) {
                int current = getState();
                int newCount = current - 1;
                if (newCount < 0 || compareAndSetState(current, newCount)) {
                    return newCount;
                }
            }
        }

        @Override
        public boolean tryReleaseShared(int interval) {
            for (; ; ) {
                int current = getState();
                int newCount = current + 1;
                if (compareAndSetState(current, newCount)) {
                    return true;
                }
            }
        }
    }

    public void lock() {
        shareLock.acquireShared(1);
    }

    public void unlock() {
        shareLock.releaseShared(1);
    }
}