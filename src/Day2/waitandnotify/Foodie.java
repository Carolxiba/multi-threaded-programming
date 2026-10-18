package Day2.waitandnotify;

public class Foodie extends Thread{
    /**
     * 1.循环
     * 2.同步代码块
     * 3.判断是否到达终止条件，到达，执行逻辑
     * 4.判断是否到达终止条件，未到达，执行逻辑
     */
    @Override
    public void run(){
        while(true){
            synchronized (Desk.lock){
                if(Desk.count == 0){
                    System.out.println("消息总数已到达限制，不再消费消息");
                    break;
                } else {
                    //执行未到达终点的逻辑
                    //1.判断桌子上是否有消息
                    if(Desk.flag == 0) {
                        //2.没有：等待
                        try {
                            Desk.lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    } else {
                        //3.有：消费消息，并且唤醒生产者
                        //消费消息
                        //更新余额
                        Desk.count--;
                        //改变消息状态，0为无消息
                        Desk.flag = 0;
                        System.out.println(getName() + "消费了一条消息，目前消费余额还有" + Desk.count);
                        //唤醒
                        Desk.lock.notifyAll();
                    }
                }
            }
        }
    }
}
