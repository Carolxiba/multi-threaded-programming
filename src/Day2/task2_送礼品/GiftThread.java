package Day2.task2_送礼品;

public class GiftThread extends Thread{
    static int count = 100;

    @Override
    public void run(){
        while(true){
            synchronized(GiftThread.class){
                if(count < 10){
                    break;
                } else {
                    //模拟送礼物耗时
                    try {
                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    count--;
                    System.out.println(getName() + "送出1份礼品,剩余礼品数量为" + count + "份");
                }
            }
        }
    }
}
