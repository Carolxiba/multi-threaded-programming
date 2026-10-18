package Day2.task3_打印奇数数字;

public class ThreadDemo {
    public static void main(String[] args) {
        PrintThread t1 = new PrintThread();
        PrintThread t2 = new PrintThread();

        t1.start();
        t2.start();
    }
}
