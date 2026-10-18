package Day2.task4_抢红包;

public class UserThread extends Thread{
    double[] list;
    static int index = 0;
    public UserThread(double[] list){
        this.list = list;
    }
    @Override
    public void run(){
        while(true){
            synchronized (UserThread.class){
                if(index > list.length - 1){
                    System.out.println(getName() + "没抢到");
                    break;
                } else {
                    System.out.println(getName() + "抢到了" + list[index++] + "元");
                    break;
                }
            }
        }
    }
}
