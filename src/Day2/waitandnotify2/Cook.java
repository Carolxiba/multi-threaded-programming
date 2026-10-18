package Day2.waitandnotify2;

import java.util.concurrent.ArrayBlockingQueue;

public class Cook extends Thread{

    ArrayBlockingQueue<String> queue;

    public Cook(ArrayBlockingQueue<String> queue){
        this.queue = queue;
    }

    @Override
    public void run(){
        while(true){
            //不断的把面条放到阻塞队列中
            //阻塞队列底层自带锁
            try {
                queue.put("面条");
                System.out.println("厨师做了一碗面条");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
