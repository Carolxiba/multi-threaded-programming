package Day2.Threadsafe2;

public class MyRunnable implements Runnable{

    int ticket;

    @Override
    public void run() {
        //1.设计一个循环，只有当票卖完之后才退出
        while(true){
            //2.设计同步代码块，用当前对象this作为锁对象
                if (extracted()) break;

        }
    }

    private synchronized boolean extracted() {
        //3.if判断，ticket没卖完的逻辑
        if(ticket < 10000){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            ticket++;
            System.out.println(Thread.currentThread().getName() + "卖出去了第" + ticket + "张票");
        } else {
            //4.if判断，ticket卖完的逻辑
            return true;
        }
        return false;
    }


}
