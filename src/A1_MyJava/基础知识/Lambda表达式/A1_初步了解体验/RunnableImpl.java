package A1_MyJava.基础知识.Lambda表达式.A1_初步了解体验;

public class RunnableImpl implements Runnable {
    @Override
    public void run() {
        System.out.println("方式一: 多线程程序启动！");
    }
}
