package A1_MyJava.����֪ʶ.���̺��߳�.A3_�߳̿���;

public class Runs_setDaemon {

    public static void main(String[] args) {

        //�����̶߳���
        Thread_setDaemon td1 = new Thread_setDaemon();
        Thread_setDaemon td2 = new Thread_setDaemon();

        //�����߳�����
        td1.setName("����");
        td2.setName("�ŷ�");

        //������������󣬹�������Ӧ������! [����ͬ��ͬ��ͬ����,����ͬ��ͬ����]
        td1.setDaemon(true);//����������Ϊ�ػ��߳�
        td2.setDaemon(true);//���ŷ�����Ϊ�ػ��߳�
        //�ػ��߳�����Ҫд��[�����߳�]��ǰ��

        //�����߳�
        td1.start();
        td2.start();

        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //������������߳�
        for (int i = 0; i < 10; i++) {
            System.out.println("�������:" + i);
        }
        /*
        �������:9 //�������,�����������ŷɲ�������������
        �ŷ�:59   // �Բ�ҲҪ��ʱ��ģ������ͻ���ȥ������
        ����:61
        �ŷ�:60
        �ŷ�:61
        �ŷ�:62
        ����:62
        �ŷ�:63
        ����:63
        �ŷ�:64

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
