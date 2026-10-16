package Day1;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class TheadDemo3 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        /**
         * 多线程的第三种实现方式：
         *  特点：可以获取到多线程的结果
         *
         *  1.创建一个类MyCallable实现Callable接口
         *  2.重写call方法（具有返回值，表示多线程运行的结果）
         *
         *  3.创建MyCallable的对象（表示多线程要执行的任务）
         *  4.创建Future的对象（管理多线程运行的结果）
         *  5.创建Thread类的对象，并启动（表示线程）
          */


        //创建MyCallable的对象
        MyCallable mc = new MyCallable();
        //创建FutureTask的对象
        FutureTask<Integer> ft = new FutureTask<>(mc);
        //创建线程的对象
        Thread t1 = new Thread(ft);
        //启动线程
        t1.start();

        //获取多线程的运行结果
        Integer result = ft.get();
        System.out.println(result);

    }
}
class MyCallable implements Callable<Integer>{

    @Override
    public Integer call() throws Exception {
        //求1~100之间的和
        int sum = 0;
        for(int i = 1; i <= 100; i++){
            sum += i;
        }
        return sum;
    }
}

