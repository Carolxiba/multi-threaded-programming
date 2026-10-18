package Day2.waitandnotify;

public class Cook extends Thread{
    @Override
    public void run(){
        /**
         * 1.循环
         * 2.同步代码块
         * 3.判断是否到达终止条件，到达的逻辑
         * 4.判断是否到达终止条件，未到达的逻辑
         */
        while(true){
            synchronized (Desk.lock){
                //判断是否到达终止条件
                if(Desk.count == 0){
                    System.out.println("消息总数已到达限制，不再生产消息");
                    break;
                } else {
                    //未到达终止条件的逻辑
                    //1.判断桌子上是否有消息
                    if(Desk.flag == 1){
                        //2.有：等待
                        try {
                            Desk.lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    } else {
                        //3.没有：制作消息
                        Desk.flag = 1;
                        System.out.println(getName() + "已生产一条消息");
                        //4.唤醒消费者
                        Desk.lock.notifyAll();
                    }

                }
            }
        }
    }
}
