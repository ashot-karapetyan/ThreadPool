package threadpoolprojectformoduleexam;



/**
 * Created by vahagn on 12/16/16.
 */
public class Worker extends  Thread {
    private JobsQueue<Runnable>  jobsQueue;
    private String name;
    private MyThreadPool threadPool;

    public Worker(MyThreadPool myThreadPool, JobsQueue<Runnable> jq, String name){
        this.threadPool = myThreadPool;
        this.jobsQueue = jq;
        this.name = name;


    }
    @Override
    public void run() {
        try {
            while(true) {
                Runnable r = jobsQueue.pop();
                System.out.println(" Taken Item by thread name:" + this.name);
                r.run();


                if (this.threadPool.isPoolShutDownInitiated()
                        /*&& this.jobsQueue.size() == 0*/) {
                    this.interrupt();
                    Thread.sleep(1);
                }
                System.out.println(" Task completed of thread:" + this.name);
            }
        }
        catch (Exception e)
        {
            System.out.println("Thread " + this.name + " has been stopped");
        }

    }

}
