package Day1;

public class ThreadDemo1 {
    public static void main(String[] args) {
        /**
         * 多线程的第一种启动方式
         *  1.自己定义一个类继承Thread
         *  2.重写run方法
         *  3.创建子类的对象，并启动线程
         */
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.setName("线程1");
        t2.setName("线程2");

        //开启线程
        t1.start();
        t2.start();

    }
}
class MyThread extends Thread{

    @Override
    public void run(){
        //书写线程要执行的代码
        for(int i = 0; i < 100; i++){
            System.out.println(getName() + "Hello World");
        }
    }
}
