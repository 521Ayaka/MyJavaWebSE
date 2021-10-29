package ����֪ʶ.���̺��߳�.A8_Lock��;
/*
ʹ�� ReentrantLock��ʵ��Lock�ӿ�
ʹ�� lock()����   ����
ʹ�� unlock()���� ����

ʹ�� try{
        lock();

    }finally{
        unlock();
    }
    ����� ���м������� ��֤һ��Ҫ����

*/

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyRunnable implements Runnable {
    private int tick = 100;
    //����Lock��
    private Lock lock = new ReentrantLock();

    //��дrun����
    @Override
    public void run() {
        while (true) {

            /*
            //����
            lock.lock();//����
            if (tick > 0) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + ":���ڳ��۵�" + tick + "��Ʊ");
                tick--;
            }
            //����
            lock.unlock();//����
            */

            //����
            try {//������������������,Ҳ����Ӱ��finally����Ŀ���
                lock.lock();//����
                if (tick > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + ":���ڳ��۵�" + tick + "��Ʊ");
                    tick--;
                }
            } finally {//finallyһ��ִ��
                //����
                lock.unlock();//����
            }


        }
    }
}
