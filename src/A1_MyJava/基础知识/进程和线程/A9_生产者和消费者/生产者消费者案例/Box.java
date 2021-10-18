package A1_MyJava.����֪ʶ.���̺��߳�.A9_�����ߺ�������.�����������߰���;
/*
Ϊ�����������ߺ����ѵĹ��̵ȴ��ͻ���

������
    void wait() ���µ�ǰ�̵߳ȴ�, ֱ����һ���̵߳��øö����notify()������notifyAll()����

    void notify()  �������ڵȴ�����������ĵ��߳�

    void notifyAll()  �������ڵȴ�����������������߳�


�쳣��
    IllegalMonitorStateException:
    �׳����쳣����ĳһ�߳��Ѿ���ͼ�ȴ�����ļ�������������ͼ֪ͨ�������ڵȴ�����ļ�����������û��ָ�����������̡߳�

����:
    û�м� wait()���� �ȴ��߳�:
                ������һֱ��ȥ��5ƿţ�̣��̲߳���ȫ

    ���Ϻ� û�м�synchronizedͬ������:
                ����IllegalMonitorStateException�쳣,

    ���Ϻ� û�м�notify()���� �����߳�:
                ���н��: ���̹�����1����������  /r/n �����߻�ȡ�˵�1ƿţ��


*/

public class Box {
    //�����Ա������ţ�̵�����
    private int make;

    //�����Ա�������������Ƿ���ţ��
    private boolean isMake = false;//Ĭ��Ϊfalse

    //����ȡţ�̵ķ���
    public /*��Ҫͬ������*/synchronized void put(int make) {
        //���wait() �ȴ��߳�
        //---�ж������ţ�̣��ͽ����̵߳ȴ����ȴ�������ȡ��ţ�̡�
        if (isMake) {
            try {
                wait();//��Ҫ�����쳣����
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        //---�ȴ�������û��ţ�̣��ͽ����ɵ��̷�������
        //����ţ�̺��������
        this.make = make;
        System.out.println("���̹�����" + make + "����������");
        //---ͬʱ����������Ϣ ��ţ��
        this.isMake = true;

        //��� ���������ȴ��߳�
        notifyAll();
    }

    //�����ȡţ�̵ķ���
    public /*��Ҫͬ������*/synchronized void get() {
        //wait() �ȴ��߳�
        //---���������û��ţ��
        if (!isMake) {
            //�ʹ������ߵ��̣߳������߷�������
            try {
                wait();//��Ҫ�����쳣
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        //---�����ţ�̣�������ȡţ��
        System.out.println("�����߻�ȡ�˵�" + make + "ƿţ��\n");
        //---ͬʱ������������Ϣ ��ţ��
        this.isMake = false;

        //��� ���������ȴ��߳�
        notifyAll();
    }


}
