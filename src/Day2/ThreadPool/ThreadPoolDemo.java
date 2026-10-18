package Day2.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {
    /**
     * public static ExecutorService newCachedThreadPool() 无上限
     * public static ExecutorServcie newFixedThreadPool(int nThreads)   有上限
     */
    public static void main(String[] args) throws InterruptedException {
        //1.获取线程池对象
        ExecutorService pool1 = Executors.newFixedThreadPool(3);
        //2.提交任务
        pool1.submit(new MyRunnable());
        pool1.submit(new MyRunnable());
        pool1.submit(new MyRunnable());
        pool1.submit(new MyRunnable());
        pool1.submit(new MyRunnable());

        //3.销毁线程池
//        pool1.shutdown();
    }
}
