package Day2;

public class ThreadMethod2 {
    public static void main(String[] args) {
        /**
         * setPriority(int newPriority)
         * final int getPriority()
         */
        //创建线程要执行的参数对象
        Runnable mr = new MyRunnable();
        //创建线程对象
        Thread t1 = new Thread(mr, "飞机");
        Thread t2 = new Thread(mr, "坦克");

        /*System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());*/
//        System.out.println(Thread.currentThread().getPriority());
        t1.setPriority(1);
        t2.setPriority(10);


        t1.start();
        t2.start();
    }
}
class MyRunnable implements Runnable{

    @Override
    public void run() {
        for(int i = 0; i < 100; i++){
            System.out.println(Thread.currentThread().getName() + '@' + i);
        }
    }
}
