package threadpoolprojectformoduleexam;

import java.util.Random;

/**
 * Created by vahagn on 12/16/16.
 */
public class MyThreadPool {
    private boolean shutDownInitiated = false;

    private  int capacity;
    private JobsQueue<Runnable> taskqueue = new JobsQueue<>();
    public MyThreadPool( int cap){
        this.capacity = cap;
        initAllWorkers();
    }

    private void initAllWorkers(){
        for(int i = 0; i < capacity; ++i)
        {
            Worker worker = new Worker(this,taskqueue,(i+1)+"");
            worker.start();
        }
    }
    public void submitJob(Runnable job){
        taskqueue.push(job);

    }
    public boolean isPoolShutDownInitiated() {
        return shutDownInitiated;
    }
    public synchronized void shutdown(){
        this.shutDownInitiated = true;
        System.out.println("ThreadPool SHUTDOWN initiated.");
    }

}
