package 基础知识.进程和线程.A8_Lock锁;

public class TestLock {

    public static void main(String[] args) {

        //创建实现Runnable接口实现类对象
        MyRunnable mr = new MyRunnable();
        //创建多线程 mr为参数
        Thread t1 = new Thread(mr, "窗口1");
        Thread t2 = new Thread(mr, "窗口2");
        Thread t3 = new Thread(mr, "窗口3");
        //启动多线程
        t1.start();
        t2.start();
        t3.start();

    }

}
