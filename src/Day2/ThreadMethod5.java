package Day2;

public class ThreadMethod5 {
    public static void main(String[] args) throws InterruptedException {
        /**
         * public final void join()     插入线程/插队线程
         */
        MyThread5 t = new MyThread5();
        t.setName("土豆");
        t.start();

        //表示t这个线程，插入到当前线程前
        t.join();

        //执行在main线程当中的执行权
        for(int i = 0; i < 10; i++){
            System.out.println("main线程" + i);
        }
    }
}
class MyThread5 extends Thread{
    @Override
    public void run(){
        for(int i = 0; i < 100; i++){
            System.out.println(getName() + '@' + i);
        }
    }
}
