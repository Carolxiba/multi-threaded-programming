package Day2.Threadsafe2;

public class ThreadDemo {
    /**
     *需求：电影院要卖100张票，分3个窗口
     */
    public static void main(String[] args) {
        //1.获取MyRunnable对象
        MyRunnable mr = new MyRunnable();
        //2.以MyRunnable作为执行方法创建三个窗口
        Thread t1 = new Thread(mr);
        Thread t2 = new Thread(mr);
        Thread t3 = new Thread(mr);

        //设置线程名称
        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");
        //3.执行线程
        t1.start();
        t2.start();
        t3.start();
    }
}
