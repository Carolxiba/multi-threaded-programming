package Day2.task7_多线程之间的比较;

import java.util.ArrayList;

public class PrizeThread extends Thread{
    static ArrayList<Integer> list;
    int maxValue = 0;
    public PrizeThread(String name){
        super(name);
    }
    ArrayList<Integer> privateList = new ArrayList<>();
    @Override
    public void run(){
        while(true){
            synchronized (PrizeThread.class){
                if(list.isEmpty()){
                    //执行抽完的逻辑
                    System.out.println("在此次抽奖过程中，" + getName() + "总共产生了" + privateList.size() + "个奖项。");
                    if(!privateList.isEmpty()){
                        StringBuilder sb = new StringBuilder();
                        int total = 0;
                        for(int i = 0; i < privateList.size(); i++){
                            int value = privateList.get(i);
                            maxValue = Math.max(maxValue, value);
                            total += value;
                            sb.append(value).append(',');
                        }
                        sb.deleteCharAt(sb.length() - 1);
                        System.out.println("\t分别为：" + sb + "最高奖项为" + maxValue + "元,总计额为" + total + "元。");
                    }
                    break;
                } else {
                    //获取随机下标
                    int index = (int) (Math.random() * list.size());
                    //将删除的奖项添加到privateList中
                    privateList.add(list.remove(index));
                }
            }
        }
    }
}
