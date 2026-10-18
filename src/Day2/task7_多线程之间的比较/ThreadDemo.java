package Day2.task7_多线程之间的比较;

import java.util.ArrayList;
import java.util.Random;

public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        int[] prizes = new int[]{10,5,20,50,100,200,500,800,2,80,300,700};
        ArrayList<Integer> list = new ArrayList<>();
        for (int prize : prizes) {
            list.add(prize);
        }
        //将list赋值给PrizeThread的static变量
        PrizeThread.list = list;
        //创建线程
        PrizeThread t1 = new PrizeThread("抽奖箱1");
        PrizeThread t2 = new PrizeThread("抽奖箱2");
        /**
         * 插入线程需要先start线程，才能够让线程启动
         */
        //启动线程
        t2.start();
        t1.start();
        //插入线程
        t2.join();
        t1.join();

        PrizeThread tar = t1.maxValue > t2.maxValue? t1 : t2;
        System.out.println("在此次抽奖过程中，" + tar.getName() +"中产生了最大奖项，该奖项金额为" + tar.maxValue);
//
//        int i = new Random().nextInt(10);
//        System.out.println(i);
    }
}
