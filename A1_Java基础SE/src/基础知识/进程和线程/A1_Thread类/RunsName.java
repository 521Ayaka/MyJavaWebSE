package 基础知识.进程和线程.A1_Thread类;
/*

查看当前线程的名称 Thread.currentThread().getName()
设置线程名称 setName();
调用线程名称 getName();

默认线程名称 Thread-0 Thread-1 ...   从0开始

*/

public class RunsName {

    public static void main(String[] args) {
        //查看当前线程的名称 main
        System.out.println(Thread.currentThread().getName());

        method1();//默认线程名字
        method2();//设置线程名称


    }

    //默认线程名字
    public static void method1(){
        //创建多线程
        MyThreadName t1 = new MyThreadName();
        MyThreadName t2 = new MyThreadName();

        //默认情况下 查看名称
        t1.start(); // Thread-0 : 0 ...
        t2.start(); // Thread-1 : 0 ...
    }


    //设置线程名称
    public static void method2(){
        //创建线程
        MyThreadName tn1 = new MyThreadName();
        MyThreadName tn2 = new MyThreadName();
        //设置名字
        tn1.setName("尴尬001")/*设置名字*/;
        tn2.setName("尴尬002")/*设置名字*/;
        //启动线程
        tn1.start(); // 尴尬001 : 67 ...
        tn2.start(); // 尴尬002 : 66 ...
    }

}

//继承Thread类 重写run方法 调用getName方法
class MyThreadName extends Thread {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 100; i++) {
            System.out.println(getName()/*调用名字*/ + " : " + i);
        }
    }
}
