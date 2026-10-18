package Day2.task3_打印奇数数字;

/**
 * 设置一个static属性，存储当前遍历到的数字
 */
public class PrintThread extends Thread{
    static int curr = 1;
    @Override
    public void run(){
        while(true){
            synchronized(PrintThread.class){
                if(curr > 100){
                    break;
                } else {
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    //1.判断当前数是否为奇数
                    if(curr % 2 == 1){
                        //2.是：print
                        System.out.println(getName() + "获取到" +curr);
                    }
                    //3.继续当前遍历
                    curr += 2;
                }
            }
        }
    }
}
