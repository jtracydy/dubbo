package concurrent.countdownlatch;

import com.google.common.collect.Lists;

import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Demo02 {

    /**
     *两种实现线程的方式，比较推荐第二种，自定义线程不容易对资源产生浪费，
     */
    //private static final ExecutorService executorService = Executors.newFixedThreadPool(3);
    private static final ExecutorService executorService = new ThreadPoolExecutor
                (5,10,30, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>());

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Version<User>> list = params();
        List<User> result =  latchFuture(list);
        result.forEach((user) -> System.out.println(user.getAge()+" "+user.getGrade()+" "+user.getName()));
    }

    /**
     * 没有用CountDownLatch实现功能
     * @param userList
     * @return
     * @throws ExecutionException
     * @throws InterruptedException
     */
    public static List<User> versionToUser(List<Version<User>> userList) throws ExecutionException, InterruptedException {

        List<Future<User>> result = Lists.newArrayList();


        for (Version<User> v : userList){
            Future<User> future  = executorService.submit(() -> v.getData());
            result.add(future);
        }
        List<User> list = Lists.newArrayList();
        for(Future<User> u : result){
            list.add(u.get());
        }
        executorService.shutdown();
        return  list;
    }

    public static List<User> latchFuture(List<Version<User>> userList) throws ExecutionException, InterruptedException {

        List<Future<User>> result = Lists.newArrayList();

        /**
         * 线程执行完成后返回结果
         */

        final CountDownLatch latch = new CountDownLatch(3);

        for (Version<User> v : userList){
            Future<User> future  = executorService.submit(new Task(v,latch));
            result.add(future);
        }
        List<User> list = Lists.newArrayList();
        for(Future<User> u : result){
            list.add(u.get());
        }
        return  list;
    }
    private static List<Version<User>> params(){
        User u1 = new User();
        u1.setAge(11);
        u1.setGrade("88");
        u1.setName("lucas");
        User u2 = new User();
        u2.setAge(21);
        u2.setGrade("90");
        u2.setName("xiaoming");
        User u3 = new User();
        u3.setAge(31);
        u3.setGrade("94");
        u3.setName("xiaohong");

        List<Version<User>> list = Lists.newArrayList();
        Version<User> v1 = new Version<>();
        v1.setData(u1);
        Version<User> v2 = new Version<>();
        v2.setData(u2);
        Version<User> v3 = new Version<>();
        v3.setData(u3);

        list.add(v1);
        list.add(v2);
        list.add(v3);
        return list;
    }
}
