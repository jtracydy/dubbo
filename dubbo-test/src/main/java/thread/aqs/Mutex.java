/*
*  2019 
*/
package thread.aqs;

/**
 * @author wangdan Date: 2019/5/13 Time: 15:53
 * @version $Id$
 */

import java.util.concurrent.locks.AbstractQueuedSynchronizer;

public class Mutex implements java.io.Serializable {

    /**
     * 静态内部类，继承AQS
     */
    private static class Sync extends AbstractQueuedSynchronizer {
        /**
         * 是否处于占用状态
         *
         * @return
         */
        @Override
        protected boolean isHeldExclusively() {
            return getState() == 1;
        }

        /**
         * 当状态为0的时候获取锁，CAS操作成功，则state状态为1，
         *
         * @param acquires
         * @return
         */
        @Override
        public boolean tryAcquire(int acquires) {
            if (compareAndSetState(0, 1)) {
                setExclusiveOwnerThread(Thread.currentThread());
                return true;
            }
            return false;
        }

        /**
         * 释放锁，将同步状态置为0
         *
         * @param releases
         * @return
         */
        @Override
        protected boolean tryRelease(int releases) {
            if (getState() == 0) {
                throw new IllegalMonitorStateException();
            }
            setExclusiveOwnerThread(null);
            setState(0);
            return true;
        }
    }

    /**
     * 同步对象完成一系列复杂的操作，我们仅需指向它即可
     */
    private final Sync sync = new Sync();

    /**
     * 加锁操作，代理到acquire（模板方法）上就行，acquire会调用我们重写的tryAcquire方法
     */
    public void lock() {
        sync.acquire(1);
    }


    /**
     * 释放锁，代理到release（模板方法）上就行，release会调用我们重写的tryRelease方法。
     */
    public void unlock() {
        sync.release(1);
    }

}