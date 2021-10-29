package 基础知识.继承.Extends12;

import java.util.Random;

public class TestThread {
    public static void main(String[] args) {
        //1.生成3个随机的售票数
        Random r1 = new Random();
        Random r2 = new Random();

        int a = r1.nextInt(101);
        int loss = 100 - a + 1;
        int b = r2.nextInt(loss);
        int c = 100-b-a;

        //3.生成3个窗口
        MyThread sell1 = new MyThread(a);
        sell1.setName("窗口1");

        MyThread sell2 = new MyThread(b);
        sell2.setName("窗口2");

        MyThread sell3 = new MyThread(c);
        sell3.setName("窗口3");

        //4.售票环节
        sell1.start();
        sell2.start();
        sell3.start();

    }
}
