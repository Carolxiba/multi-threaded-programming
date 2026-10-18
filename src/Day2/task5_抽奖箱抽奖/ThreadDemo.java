package Day2.task5_抽奖箱抽奖;

import java.util.ArrayList;

public class ThreadDemo {
    public static void main(String[] args) {
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
        //启动线程
        t2.start();
        t1.start();

    }
}
