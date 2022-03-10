package 基础知识.进程和线程.A6_线程同步.B3_同步方法;

public class RunsMethod {

    public static void main(String[] args) {
        MyRunnable run = new MyRunnable();

        Thread t11 = new Thread(run, "窗口1");
        Thread t12 = new Thread(run, "窗口2");
        Thread t13 = new Thread(run, "窗口3");

        t11.start();
        t12.start();
        t13.start();

        try {
            Thread.sleep(1000*20);
            System.exit(0);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
