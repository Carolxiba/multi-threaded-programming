package Day2.task2_送礼品;

public class ThreadDemo {
    public static void main(String[] args) {

        GiftThread t1 = new GiftThread();
        GiftThread t2 = new GiftThread();

        t1.setName("小白");
        t2.setName("小红");

        t1.start();
        t2.start();
    }
}
