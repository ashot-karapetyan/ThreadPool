package threadpoolprojectformoduleexam;

/**
 * Created by vahagn on 12/16/16.
 */
import java.util.LinkedList;

public class JobsQueue<T> implements IBlockingQueue<T> {

    private LinkedList<T>  mqueue = new LinkedList<T>();

    public synchronized void push(T elem){

        mqueue.add(elem);
        notifyAll();
    }

    public synchronized T pop(){
        T elem = null;
        try {
            if (mqueue.isEmpty()) {
                wait();
            }
        }
        catch (InterruptedException e){
            System.out.println(e.getStackTrace());
            return elem;
        }
        elem = mqueue.remove();
        return elem;

    }
    public int size(){
        return mqueue.size();
    }
}
