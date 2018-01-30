package threadpoolprojectformoduleexam;
/**
 * Created by vahagn on 12/16/16.
 */

public interface IBlockingQueue <T> {
    void push(T elem);

    T pop();

}
