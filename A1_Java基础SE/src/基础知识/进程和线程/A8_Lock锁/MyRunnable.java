package 基础知识.进程和线程.A8_Lock锁;
/*
使用 ReentrantLock来实现Lock接口
使用 lock()方法   上锁
使用 unlock()方法 开锁

使用 try{
        lock();

    }finally{
        unlock();
    }
    代码块 进行加锁开锁 保证一定要开锁

*/

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyRunnable implements Runnable {
    private int tick = 100;
    //创建Lock锁
    private Lock lock = new ReentrantLock();

    //重写run方法
    @Override
    public void run() {
        while (true) {

            /*
            //上锁
            lock.lock();//上锁
            if (tick > 0) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + ":正在出售第" + tick + "张票");
                tick--;
            }
            //开锁
            lock.unlock();//开锁
            */

            //上锁
            try {//如果这里面出现了问题,也不会影响finally里面的开锁
                lock.lock();//上锁
                if (tick > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + ":正在出售第" + tick + "张票");
                    tick--;
                }
            } finally {//finally一定执行
                //开锁
                lock.unlock();//开锁
            }


        }
    }
}
