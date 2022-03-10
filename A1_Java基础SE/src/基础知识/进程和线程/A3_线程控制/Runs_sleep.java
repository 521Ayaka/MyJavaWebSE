package 基础知识.进程和线程.A3_线程控制;

public class Runs_sleep {

    public static void main(String[] args) {

        //创建线程
        ThreadSleep ts1 = new ThreadSleep();
        ThreadSleep ts2 = new ThreadSleep();
        ThreadSleep ts3 = new ThreadSleep();
        //设置线程名字
        ts1.setName("曹操");
        ts2.setName("刘备");
        ts3.setName("孙权");

        //启动线程
        ts1.start();
        ts2.start();
        ts3.start();
        // 刘备:0
        // 曹操:0
        // 孙权:0
        // 曹操:1
        // 刘备:1
        // 孙权:1
        // 刘备:2
        // 曹操:2
        // 孙权:2
        // 刘备:3
        // 曹操:3
        // 孙权:3
        // ...
    }

}

//线程类
class ThreadSleep extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + ":" + i);
            //使用sleep静态方法，没执行一次停留1000毫秒
            try {//需要异常处理 try...catch
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
