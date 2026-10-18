package Day2.task5_抽奖箱抽奖;

import java.util.ArrayList;
import java.util.Map;

public class PrizeThread extends Thread{
    static ArrayList<Integer> list;
    public PrizeThread(String name){
        super(name);
    }

    @Override
    public void run(){
        while(true){
            synchronized (PrizeThread.class){
                if(list.isEmpty()){
                    break;
                } else {
                    //获取list大小
                    int size = list.size();
                    //采用数学的random,获得一个随机下标
                    int index =(int) (Math.random() * size);
                    //获得下标为index的奖项的金额
                    Integer amount = list.get(index);
                    System.out.println(getName() + "又产生了一个" + amount + "元大奖");
                    //去除下标为index的奖项
                    list.remove(index);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }
}
