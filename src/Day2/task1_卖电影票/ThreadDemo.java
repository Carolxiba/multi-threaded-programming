package Day2.task1_卖电影票;

public class ThreadDemo {
    public static void main(String[] args) {

        //1.创建两个窗口线程
        WindowThread t1 = new WindowThread();
        WindowThread t2 = new WindowThread();
        //2.为线程设置Name
        t1.setName("窗口1");
        t2.setName("窗口2");
        //3.执行线程
        t1.start();
        t2.start();

    }
}
