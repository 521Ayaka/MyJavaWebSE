package ����֪ʶ.�̳�.Extends12;

import java.util.Random;

public class TestThread {
    public static void main(String[] args) {
        //1.����3���������Ʊ��
        Random r1 = new Random();
        Random r2 = new Random();

        int a = r1.nextInt(101);
        int loss = 100 - a + 1;
        int b = r2.nextInt(loss);
        int c = 100-b-a;

        //3.����3������
        MyThread sell1 = new MyThread(a);
        sell1.setName("����1");

        MyThread sell2 = new MyThread(b);
        sell2.setName("����2");

        MyThread sell3 = new MyThread(c);
        sell3.setName("����3");

        //4.��Ʊ����
        sell1.start();
        sell2.start();
        sell3.start();

    }
}
