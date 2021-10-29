package 基础知识.进程和线程.A6_线程同步.B1_售票案例;
/*
出现的问题:
    1.出现重复的票数
    窗口1正在出售第:100张票
    窗口3正在出售第:100张票
    窗口2正在出售第:100张票

    2.票数出现负数票数
    窗口2正在出售第:-1张票

*/

public class Runs {

    public static void main(String[] args) {

        //创建Runnable实现类对象
        MyRunnable runn = new MyRunnable();

        //创建Thread对象
        Thread t1 = new Thread(runn, "窗口1");
        Thread t2 = new Thread(runn, "窗口2");
        Thread t3 = new Thread(runn, "窗口3");

        //开始售票
        t1.start();
        t2.start();
        t3.start();

    }

}
