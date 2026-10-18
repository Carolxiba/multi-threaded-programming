package Day2.ThreadPool2;

import java.util.concurrent.*;

public class ThreadPoolDemo {
    /**
     * ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor
     * (核心线程数量，最大线程数量，空闲线程最大存活时间，任务队列，创建线程工厂，任务拒绝策略）
     *  参数一：核心线程数量              不能小于0
     *  参数二：最大线程数量              不能小于等于0，最大线程数量 >= 核心数量
     *  参数三：空闲线程最大存活时间        不能小于0
     *  参数四：时间单位                  用TimeUnit指定
     *  参数五：任务队列                  ！= null
     *  参数六：创建线程工厂               ！= null
     *  参数七：任务拒绝策略               ！= null
     *
     */
    public static void main(String[] args) {

        ThreadPoolExecutor pool = new ThreadPoolExecutor(
                3,
                6,
                60,
                TimeUnit.SECONDS,
                new LinkedBlockingQueue<>(3),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy()
        );
        pool.submit(() ->{
            System.out.println("我要上床了");
        });
        pool.shutdown();
    }
}
