package A1_MyJava.基础知识.进程和线程.A9_生产者和消费者.生产者消费者案例;

public class 消费者 implements Runnable{
    //生成奶箱
    private Box box;

    public 消费者(Box box) {
        this.box = box;
    }

    @Override
    public void run() {
        //获取牛奶
        while (true){
            box.get();
        }
    }
}
