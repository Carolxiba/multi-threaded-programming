package Day2.Threadsafe3;

public class ThreadDemo {
    public static void main(String[] args) {
        /**
         *
         * 需求：
         *      电影院卖票，共有一百张票，有3个窗口卖票，设计程序模拟卖票
         *
         */
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();

        //起名字
        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        //开启线程
        t1.start();
        t2.start();
        t3.start();
    }
}
