package A1_MyJava.基础知识.进程和线程.A9_生产者和消费者.生产者消费者案例;
/*
为了体现生产者和消费的过程等待和唤醒

方法：
    void wait() 导致当前线程等待, 直到另一个线程调用该对象的notify()方法或notifyAll()方法

    void notify()  唤醒正在等待对象监视器的单线程

    void notifyAll()  唤醒正在等待对象监视器的所有线程


异常：
    IllegalMonitorStateException:
    抛出的异常表明某一线程已经试图等待对象的监视器，或者试图通知其他正在等待对象的监视器而本身没有指定监视器的线程。

调试:
    没有加 wait()方法 等待线程:
                消费者一直在去第5瓶牛奶，线程不安全

    加上后 没有加synchronized同步方法:
                出现IllegalMonitorStateException异常,

    加上后 没有加notify()方法 唤醒线程:
                运行结果: 送奶工将第1放入了奶箱  /r/n 消费者获取了第1瓶牛奶


*/

public class Box {
    //定义成员变量，牛奶的数量
    private int make;

    //定义成员变量，奶箱中是否有牛奶
    private boolean isMake = false;//默认为false

    //定义取牛奶的方法
    public /*需要同步方法*/synchronized void put(int make) {
        //添加wait() 等待线程
        //---判断如果有牛奶，就进行线程等待，等待消费者取走牛奶。
        if (isMake) {
            try {
                wait();//需要进行异常处理
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        //---等待奶箱中没有牛奶，就将生成的奶放入奶箱
        //生产牛奶后放入奶箱
        this.make = make;
        System.out.println("送奶工将第" + make + "放入了奶箱");
        //---同时设置奶箱信息 有牛奶
        this.isMake = true;

        //最后 唤醒其他等待线程
        notifyAll();
    }

    //定义获取牛奶的方法
    public /*需要同步方法*/synchronized void get() {
        //wait() 等待线程
        //---如果奶箱中没有牛奶
        if (!isMake) {
            //就打开生产者的线程，生产者放入奶箱
            try {
                wait();//需要处理异常
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        //---如果有牛奶，消费者取牛奶
        System.out.println("消费者获取了第" + make + "瓶牛奶\n");
        //---同时，设置奶箱信息 无牛奶
        this.isMake = false;

        //最后 唤醒其他等待线程
        notifyAll();
    }


}
