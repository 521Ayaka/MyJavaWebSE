package 基础知识.进程和线程.A5_Runnable接口;
/*
方式二: 实现Runnable接口
    --定义一个类MyRunnable实现Runnable接口
    --在MyRunnable类中覆盖重写run()方法
    --创建MyRunnable类的对象
    --创建Thread类的对象,把MyRunnable对象作为构造方法的参数
    --启动线程

多线程的实现方案有两种:
    第一种: 继承Thread类
    第二种: 实现Runnable接口

相比继承Thread类,实现Runnable接口的好处:
    第一: 避免了Java单继承的局限行,接口是可以继承其他的类的
    第二: 适合多个相同程序的代码去处理同一个资源的情况,把线程和程序的代码、数据有效分离,
            较好的体现了面向对象的设计事项。


*/

public class Runs {
    public static void main(String[] args) {
        //创建Runnable接口实现对象
        MyRunnable my = new MyRunnable();

        //将my作为参数传给Thread构造方法，创建Thread
        Thread t1 = new Thread(my);
        Thread t2 = new Thread(my);

        //这样是默认线程名，可以设置名字，也可以使用构造方法
        Thread t3 = new Thread(my, "尴尬");

        //启动线程
        t1.start();
        t2.start();
        t3.start();

    }
}

//实现Runnable接口 实现run()方法
class MyRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
            //Runnable接口中没后设置名字的方法。
            //使用获取当前线程名字的方法获取。
        }
    }
}

