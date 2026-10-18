package Day2;

public class ThreadMethod4 {

    public static void main(String[] args) {
        /**
         * public static void yield()   出让线程/礼让线程
         */

        MyThread4 t1 = new MyThread4();
        MyThread4 t2 = new MyThread4();

        t1.setName("飞机");
        t2.setName("坦克");

        t1.start();
        t2.start();
    }
}
class MyThread4 extends Thread{
    @Override
    public void run(){
        for(int i = 0; i < 100; i++){
            System.out.println(getName() + '@' + i);

            //表示出让当前cpu的执行权
            Thread.yield();
        }
    }
}

