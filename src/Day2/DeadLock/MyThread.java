package Day2.DeadLock;

public class MyThread extends Thread{
    //定义两个锁对象
    static final Object objectA = new Object();
    static final Object objectB = new Object();

    @Override
    public void run(){
        //1.循环
        while(true) {
            //判断，是线程1执行的逻辑
            if("线程1".equals(getName())){
                synchronized (objectA){
                    System.out.println(getName() + "拿到了A锁,准备拿B锁");
                    synchronized (objectB){
                        System.out.println(getName() + "拿到了A锁和B锁");
                    }
                }
            }
            //判断，是线程2执行的逻辑
            if("线程2".equals(getName())){
                synchronized (objectB){
                    System.out.println(getName() + "拿到了A锁,准备拿B锁");
                    synchronized (objectA){
                        System.out.println(getName() + "拿到了A锁和B锁");
                    }
                }
            }
        }
    }
}
