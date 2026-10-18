package Day2.task1_卖电影票;

public class WindowThread extends Thread{
    static int count = 1000;

    /**
     * 1.循环
     * 2.代码块同步
     * 3.判断条件是否到达重点
     * 4.否：否的逻辑
     * 5.是：是的逻辑
     */
    @Override
    public void run(){
       while(true){
           synchronized (WindowThread.class){
               if(count == 0){
                   break;
               } else {
                   try {
                       Thread.sleep(30);
                   } catch (InterruptedException e) {
                       throw new RuntimeException(e);
                   }
                   count--;
                   System.out.println(getName() + "售卖出一张电影票,剩余电影票" + count + "张");
               }
           }
       }
    }
}
