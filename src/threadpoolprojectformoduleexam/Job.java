package threadpoolprojectformoduleexam;

/**
 * Created by vahagn on 12/16/16.
 */
public class Job implements Runnable {
    private String name;
    public Job(String name ){

        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Starting Task "  + name + " ....");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Task " + name + " Completed....");
    }
}
