package Day2.waitandnotify2;


import java.util.concurrent.ArrayBlockingQueue;

public class ThreadDemo {
    public static void main(String[] args) {
        /**
         *  需求：利用阻塞队列完成生产者和消费者的代码
         *  细节：
         *      生产者和消费者必须用同一个阻塞队列
         */

        //1.创建阻塞队列
        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(1);

        //2.创建线程对象，并把阻塞队列传递过去
        Cook cook = new Cook(queue);
        Foodie foodie = new Foodie(queue);

        //3.开启线程
        cook.start();
        foodie.start();

    }
}
