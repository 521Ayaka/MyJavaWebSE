package ����֪ʶ.���̺��߳�.A8_Lock��;

public class TestLock {

    public static void main(String[] args) {

        //����ʵ��Runnable�ӿ�ʵ�������
        MyRunnable mr = new MyRunnable();
        //�������߳� mrΪ����
        Thread t1 = new Thread(mr, "����1");
        Thread t2 = new Thread(mr, "����2");
        Thread t3 = new Thread(mr, "����3");
        //�������߳�
        t1.start();
        t2.start();
        t3.start();

    }

}
