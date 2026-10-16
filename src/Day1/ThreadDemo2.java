package Day1;

public class ThreadDemo2 {
    public static void main(String[] args) {
        /**
         * 多线程的第二种启动方式：
         *  1.自己创建一个类实现Runnable接口
         *  2.重写run方法
         *  3.创建一个自己类的对象
         *  4.创建一个Thread类的对象，并开启线程
         */

        //创建MyRun对象
        //表示多线程要执行的任务
        MyRun mr = new MyRun();

        //创建线程对象
        Thread t1 = new Thread(mr);
        Thread t2 = new Thread(mr);

        //设置名字
        t1.setName("t1");
        t2.setName("t2");

        //开启线程
        t1.start();
        t2.start();
    }

}

class MyRun implements Runnable{
    @Override
    public void run(){
        for(int i = 0; i < 100; i++){
            //获取到当前线程的对象
//            Thread thread = Thread.currentThread();
            System.out.println(Thread.currentThread().getName() +  "Hello World");
        }
    }
}
