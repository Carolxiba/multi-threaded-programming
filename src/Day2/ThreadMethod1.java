package Day2;

public class ThreadMethod1 {
    public static void main(String[] args) throws InterruptedException {
        /**
         *  String getName()
         *  setName(String name)
         *  细节：
         *      1.如果没有给线程设置名字，有默认名字
         *          格式：Thread-X(X是序号,从0开始)
         *      2.构造方法进行设置名字
         *
         *  static Thread currentThread()
         *  细节：
         *      当JVM虚拟机启动之后，会自动启动多条线程
         *      其中有一个就叫做main线程
         *      他的作用就是调用main方法，并执行里面的代码
         *  static void sleep(long time) 单位是毫秒
         *  细节：
         *      1.哪条线程执行到这个方法，该线程就会停留指定的时间
         *      2.时间到了之后，线程就会自动的苏醒，继续执行下面的其他代码
         */
        //1.创建线程
        Thread t1 = new MyThread("飞机");
        Thread t2 = new MyThread("坦克");
        //2.开启线程
        t1.start();
        t2.start();

        //哪条线程执行到这个方法，此时获取的就是哪条线程的对象
        /*Thread t = Thread.currentThread();
        String name = t.getName();
        System.out.println(name);*/

        /*
        System.out.println(1111111);
        Thread.sleep(10000);
        System.out.println(2222222);*/
    }
}
class MyThread extends Thread{
    public MyThread(String name){
        super(name);
    }
    @Override
    public void run(){
        for(int i = 0; i < 100; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(getName() + '@' + i);
        }
    }
}