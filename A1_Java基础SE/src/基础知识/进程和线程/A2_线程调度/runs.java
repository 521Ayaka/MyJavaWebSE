package 基础知识.进程和线程.A2_线程调度;

public class runs {

    public static void main(String[] args) {
        //创建多线程对象
        ThreadPriority tp1 = new ThreadPriority();
        ThreadPriority tp2 = new ThreadPriority();
        ThreadPriority tp3 = new ThreadPriority();

        //设置名字
        tp1.setName("高铁");  //5 默认调度是5
        tp2.setName("飞机");  //5
        tp3.setName("拖拉机");//5

        //Thread类中有三个静态成员变量
        System.out.println(Thread.MIN_PRIORITY); //1
        System.out.println(Thread.NORM_PRIORITY);//5
        System.out.println(Thread.MAX_PRIORITY); //10
        System.out.println("还可以在中间取int设置调度");

        System.out.println("==========================");

        //调度是无序的 设置了调度只是抢到CPU片的概率高了而已,并不代表一定先运行。

        //默认调度 启动多线程
//        priority_NORM(tp1);
//        priority_NORM(tp2);
//        priority_NORM(tp3);

        //设置调度
        priority_MIN_TO_MAX(tp1,5);
        priority_MIN_TO_MAX(tp2,10);
        priority_MIN_TO_MAX(tp3,1);


        //查看各线程的调度
        System.out.println(tp1.getPriority());
        System.out.println(tp2.getPriority());
        System.out.println(tp3.getPriority());

    }

    public static void priority_NORM(ThreadPriority tp){
        tp.start();
    }

    public static void priority_MIN_TO_MAX(ThreadPriority tp,int p){
        //设置线程调度
        tp.setPriority(p);
        tp.start();
    }


}
