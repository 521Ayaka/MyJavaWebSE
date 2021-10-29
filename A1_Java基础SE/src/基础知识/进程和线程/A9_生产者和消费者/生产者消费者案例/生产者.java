package 基础知识.进程和线程.A9_生产者和消费者.生产者消费者案例;

public class 生产者 implements Runnable{
    //生成奶箱
    private Box box;

    public 生产者(Box box) {
        this.box = box;
    }

    @Override
    public void run() {
        //生产者生成牛奶
        for (int i = 1; i <= 30 ; i++) {
            box.put(i);
        }
    }
}
