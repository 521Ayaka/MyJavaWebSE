package A1_MyJava.基础知识.进程和线程.A9_生产者和消费者.生产者消费者案例;

public class BoxDame {

    //启动
    public static void main(String[] args) {
        //创建奶箱
        Box box = new Box();
        //创建生产者
        生产者 s = new 生产者(box);
        //创建消费类
        消费者 x = new 消费者(box);

        //创建多线程
        Thread ts = new Thread(s,"生产者");
        Thread tx = new Thread(x,"消费者");

        //启动多线程
        ts.start();
        tx.start();


    }

}
