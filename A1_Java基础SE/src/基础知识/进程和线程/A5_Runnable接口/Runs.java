package ����֪ʶ.���̺��߳�.A5_Runnable�ӿ�;
/*
��ʽ��: ʵ��Runnable�ӿ�
    --����һ����MyRunnableʵ��Runnable�ӿ�
    --��MyRunnable���и�����дrun()����
    --����MyRunnable��Ķ���
    --����Thread��Ķ���,��MyRunnable������Ϊ���췽���Ĳ���
    --�����߳�

���̵߳�ʵ�ַ���������:
    ��һ��: �̳�Thread��
    �ڶ���: ʵ��Runnable�ӿ�

��ȼ̳�Thread��,ʵ��Runnable�ӿڵĺô�:
    ��һ: ������Java���̳еľ�����,�ӿ��ǿ��Լ̳����������
    �ڶ�: �ʺ϶����ͬ����Ĵ���ȥ����ͬһ����Դ�����,���̺߳ͳ���Ĵ��롢������Ч����,
            �Ϻõ���������������������


*/

public class Runs {
    public static void main(String[] args) {
        //����Runnable�ӿ�ʵ�ֶ���
        MyRunnable my = new MyRunnable();

        //��my��Ϊ��������Thread���췽��������Thread
        Thread t1 = new Thread(my);
        Thread t2 = new Thread(my);

        //������Ĭ���߳����������������֣�Ҳ����ʹ�ù��췽��
        Thread t3 = new Thread(my, "����");

        //�����߳�
        t1.start();
        t2.start();
        t3.start();

    }
}

//ʵ��Runnable�ӿ� ʵ��run()����
class MyRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
            //Runnable�ӿ���û���������ֵķ�����
            //ʹ�û�ȡ��ǰ�߳����ֵķ�����ȡ��
        }
    }
}

