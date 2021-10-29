package 基础知识.进程和线程.A6_线程同步.B3_同步方法;

public class MyRunnable implements Runnable {
    private int tick = 100;
    private Object object = new Object();
    private int jia = 0;

    @Override
    public void run() {
        while (true) {
            if (jia % 2 == 0) {
                synchronized (/*object*/this) {
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
            } else {
//                synchronized (object) {
//                    if (tick > 0) {
//                        try {
//                            Thread.sleep(100);
//                        } catch (InterruptedException e) {
//                            e.printStackTrace();
//                        }
//                        System.out.println(Thread.currentThread().getName() + "正在出售第:" + tick + "张票");
//                        tick--;
//                    }
//                }
                method();
            }
            jia++;
        }
    }

    //使用[同步方法]
    public synchronized void method() {
        /*
        这样会出现安全问题
        上面的锁是 obj 对象
        而这个方法的 锁 是obj

        而是this本对象
        把上面的obj 换成this验证
        */
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
