/*
*  2019 
*/
package thread.aqs;

import java.util.concurrent.locks.AbstractQueuedSynchronizer;

/**
 * @author wangdan Date: 2019/9/2 Time: 16:37
 * @version $Id$
 */
public class BankServiceWindowsShare {


    private final Sync sync;

    public BankServiceWindowsShare(int count) {
        sync = new Sync(count);
    }

    private static class Sync extends AbstractQueuedSynchronizer {
        Sync(int count) {
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
        sync.acquireShared(1);
    }


    public void unlock() {
        sync.releaseShared(1);
    }
}