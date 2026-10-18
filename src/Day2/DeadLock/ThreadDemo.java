package Day2.DeadLock;

public class ThreadDemo {
    public static void main(String[] args) {
        //1.创建2个线程对象
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        //2.设置线程名
        t1.setName("线程1");
        t2.setName("线程2");

        //3.执行线程
        t1.start();
        t2.start();
    }
}
