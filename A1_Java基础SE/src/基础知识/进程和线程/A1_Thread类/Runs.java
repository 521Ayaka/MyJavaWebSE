package ����֪ʶ.���̺��߳�.A1_Thread��;
/*
��ʽ1: �̳�Thread��
        -- ����һ��MyThread��ȥ�̳�Thread��
        -- ��MyThread������дrun()����
        -- ����MyThread��Ķ���
        -- �����߳� start()����

*/

public class Runs {

    public static void main(String[] args) {
        //�������߳�
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();

        thread1.str = "�߳�1:";
        thread2.str = "�߳�2:";

        //�����߳�
//        thread1.run(); //run�������������߳�
//        thread2.run();

        // void start() ʹ���߳̿�ʼִ�У�Java ��������ø��̵߳� run ������
        thread1.start();
        thread2.start();

    }

}

//�̳�Thread�ӿ�
class MyThread extends Thread{

    //��дrun()����
    //˵��: ������߳���ʹ�ö����� Runnable ���ж�����ģ�����ø� Runnable ����� run ������
    //      ���򣬸÷�����ִ���κβ��������ء�
    public String str;
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(str+i);
        }
    }
}
