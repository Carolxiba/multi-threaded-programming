package Day2;

public class ThreadMethod3 {
    public static void main(String[] args) {
        /**
         *
         * final void setDaemon(boolean on) 设置为守护线程（备胎线程）
         *
         * 细节：
         *      当其他的非守护线程执行完毕后，守护线程会 ”陆续“ 结束
         * 通俗易懂：
         *      当女神线程执行完毕后，那么备胎也没有存在的必要了
         *
         *
         */


        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();

        t1.setName("女神");
        t2.setName("备胎");

        t2.setDaemon(true);

        t1.start();
        t2.start();

    }
}

class MyThread1 extends Thread{

    @Override
    public void run(){
        for(int i = 0; i < 10; i++){
            System.out.println(getName() + '@' + i);
        }
    }
}
class MyThread2 extends Thread{

    @Override
    public void run(){
        for(int i = 0; i < 100; i++){
            System.out.println(getName() + '@' + i);
        }
    }
}
