package Day2.Threadsafe3;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread extends Thread{

    //表示这个线程共享这个ticket
    static int ticket = 0;

    //锁对象，一定要是唯一的
    static final Object object = new Object();

    static final Lock lock = new ReentrantLock();

    @Override
    public void run(){
        while(true){
//            synchronized (MyThread.class) {
            try {
                lock.lock();
                if(ticket < 100){
                    Thread.sleep(50);
                    ticket++;
                    System.out.println(getName() + "正在卖第"
                            + ticket + "张票");
                } else {
                    break;
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                lock.unlock();
            }
//            }
        }
    }
}
