package A1_MyJava.����֪ʶ.���̺��߳�.A3_�߳̿���;

public class Runs_sleep {

    public static void main(String[] args) {

        //�����߳�
        ThreadSleep ts1 = new ThreadSleep();
        ThreadSleep ts2 = new ThreadSleep();
        ThreadSleep ts3 = new ThreadSleep();
        //�����߳�����
        ts1.setName("�ܲ�");
        ts2.setName("����");
        ts3.setName("��Ȩ");

        //�����߳�
        ts1.start();
        ts2.start();
        ts3.start();
        // ����:0
        // �ܲ�:0
        // ��Ȩ:0
        // �ܲ�:1
        // ����:1
        // ��Ȩ:1
        // ����:2
        // �ܲ�:2
        // ��Ȩ:2
        // ����:3
        // �ܲ�:3
        // ��Ȩ:3
        // ...
    }

}

//�߳���
class ThreadSleep extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + ":" + i);
            //ʹ��sleep��̬������ûִ��һ��ͣ��1000����
            try {//��Ҫ�쳣���� try...catch
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
