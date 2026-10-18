package Day2.task4_抢红包;

public class ThreadDemo {
    public static void main(String[] args) {
        double total = 100.0;
        double[] list = new double[3];
        for(int i = 0; i < 2; i++){
            list[i] = Math.round(total * Math.random() * 100) / 100.0;
            total -= list[i];
        }
        list[2] = Math.round(total * 100) / 100.0;

        UserThread t1 = new UserThread(list);
        UserThread t2 = new UserThread(list);
        UserThread t3 = new UserThread(list);
        UserThread t4 = new UserThread(list);
        UserThread t5 = new UserThread(list);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
