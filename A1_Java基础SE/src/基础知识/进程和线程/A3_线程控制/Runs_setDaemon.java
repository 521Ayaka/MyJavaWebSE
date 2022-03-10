package 基础知识.进程和线程.A3_线程控制;

public class Runs_setDaemon {

    public static void main(String[] args) {

        //创建线程对象
        Thread_setDaemon td1 = new Thread_setDaemon();
        Thread_setDaemon td2 = new Thread_setDaemon();

        //设置线程名称
        td1.setName("关羽");
        td2.setName("张飞");

        //当大哥刘备死后，关羽刘备应该自刎! [不求同年同月同日生,但求同年同月死]
        td1.setDaemon(true);//将关羽设置为守护线程
        td2.setDaemon(true);//将张飞设置为守护线程
        //守护线程设置要写在[启动线程]的前面

        //启动线程
        td1.start();
        td2.start();

        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //大哥刘备是主线程
        for (int i = 0; i < 10; i++) {
            System.out.println("大哥刘备:" + i);
        }
        /*
        大哥刘备:9 //大哥死后,其他关羽与张飞并不会立即死亡
        张飞:59   // 自裁也要有时间的，但随后就会死去。。。
        关羽:61
        张飞:60
        张飞:61
        张飞:62
        关羽:62
        张飞:63
        关羽:63
        张飞:64

        */
    }

}

class Thread_setDaemon extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + ":" + i);
        }
    }
}
