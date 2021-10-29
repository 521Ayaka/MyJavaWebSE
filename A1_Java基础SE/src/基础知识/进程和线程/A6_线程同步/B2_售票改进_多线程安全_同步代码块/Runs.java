package 基础知识.进程和线程.A6_线程同步.B2_售票改进_多线程安全_同步代码块;
/*
线程安全问题：
    -- 是否是多线程环境
    -- 是否有共享数据
    -- 是否有多条语句操作共享数据

三条语句不能同时满足！！！

解决方案:
破环其中一条即可,该案例只能破环第三条,(前两项再用)

使用: [同步代码块]
锁多条语句操作共享数据, 可以使用同步代码快实现

[格式]:
        synchronized(任意对象){
            多条语句操作共享数据的代码;
        }
[同步的好处]: 解决了多线程的数据安全问题。
[同步的弊端]: 当线程很多时,因为每个线程都会去判断同步上的锁,这是很耗费资源的,无形中会降低程序的运行效率。

*/
public class Runs {

    public static void main(String[] args) {
        MyRunnable runn = new MyRunnable();

        Thread t1 = new Thread(runn, "窗口1");
        Thread t2 = new Thread(runn, "窗口2");
        Thread t3 = new Thread(runn, "窗口3");

        t1.start();
        t2.start();
        t3.start();
        
    }

}
