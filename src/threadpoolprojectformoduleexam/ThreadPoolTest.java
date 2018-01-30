package threadpoolprojectformoduleexam;

/**
 * Created by vahagn on 12/16/16.
 */
public class ThreadPoolTest {

    public static void main(String args[]) throws InterruptedException{
        MyThreadPool myThreadPool = new MyThreadPool(2);
        Runnable job1 = new Job("task-1");
        Runnable job2 = new Job("task-2");
        Runnable job3 = new Job("task-3");
        Runnable job4 = new Job("task-4");
        myThreadPool.submitJob(job1);
        myThreadPool.submitJob(job2);
        myThreadPool.submitJob(job3);
        myThreadPool.submitJob(job4);


        Thread.sleep(1000);
        myThreadPool.shutdown();


    }
}


