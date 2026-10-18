package Day2.waitandnotify;

public class ThreadDemo {
    /**
     *需求：完成生产者和消费者（等待唤醒机制）的代码
     *      实现线程轮流交替执行的效果
     */
    public static void main(String[] args) {
        //1.创建线程实例
        Cook cook = new Cook();
        Foodie foodie = new Foodie();
        //2.设置线程名称
        cook.setName("生产者");
        foodie.setName("消费者");
        //3.开启线程
        cook.start();
        foodie.start();
    }
}
