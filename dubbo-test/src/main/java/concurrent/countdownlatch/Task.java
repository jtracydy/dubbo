package concurrent.countdownlatch;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;

public class Task implements Callable<User>{

    private Version<User> version;
    private CountDownLatch latch;

    public Task(Version<User> version, CountDownLatch latch) {
        this.version = version;
        this.latch = latch;
    }

    @Override
    public User call() throws Exception {
        User u;
        try {
            u = version.getData();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }finally {
            latch.countDown();
        }
        return u;
    }
}
