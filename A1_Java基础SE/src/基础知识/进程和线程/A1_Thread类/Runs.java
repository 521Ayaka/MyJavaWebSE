package 基础知识.进程和线程.A1_Thread类;
/*
方式1: 继承Thread类
        -- 定义一个MyThread类去继承Thread类
        -- 在MyThread类中重写run()方法
        -- 创建MyThread类的对象
        -- 启动线程 start()方法

*/

public class Runs {

    public static void main(String[] args) {
        //创建多线程
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();

        thread1.str = "线程1:";
        thread2.str = "线程2:";

        //启动线程
//        thread1.run(); //run并不会启动多线程
//        thread2.run();

        // void start() 使该线程开始执行；Java 虚拟机调用该线程的 run 方法。
        thread1.start();
        thread2.start();

    }

}

//继承Thread接口
class MyThread extends Thread{

    //重写run()方法
    //说明: 如果该线程是使用独立的 Runnable 运行对象构造的，则调用该 Runnable 对象的 run 方法；
    //      否则，该方法不执行任何操作并返回。
    public String str;
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(str+i);
        }
    }
}
