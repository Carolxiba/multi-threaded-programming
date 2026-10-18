package Day2.waitandnotify;

public class Desk {
    //定义一个锁对象
    static final Object lock = new Object();
    //0表示没有消息，1表示桌子上有消息
    static int flag = 0;
    //表示生产者能够消费的消息总数
    static int count = 10;

}
