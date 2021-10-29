package 基础知识.进程和线程.A6_线程同步.B1_售票案例;

public class MyRunnable implements Runnable {

    private int tick = 100;//门票总数

    @Override
    public void run() {

        while (true) {
            if (tick > 0) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "正在出售第:" + tick + "张票");
                tick--;

            }
        }

    }
}
