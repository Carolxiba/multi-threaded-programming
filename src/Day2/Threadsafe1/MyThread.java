package Day2.Threadsafe1;

public class MyThread extends Thread{

    //表示这个线程共享这个ticket
    static int ticket = 0;

    //锁对象，一定要是唯一的
    static final Object object = new Object();

    @Override
    public void run(){
        while(true){
            synchronized (MyThread.class) {
                if(ticket < 100){
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    ticket++;
                    System.out.println(getName() + "正在卖第"
                            + ticket + "张票");
                } else {
                    break;
                }
            }
        }
    }
}
