package A1_MyJava.����֪ʶ.���̺��߳�.A6_�߳�ͬ��.B2_��Ʊ�Ľ�_���̰߳�ȫ_ͬ�������;
/*
�̰߳�ȫ���⣺
    -- �Ƿ��Ƕ��̻߳���
    -- �Ƿ��й�������
    -- �Ƿ��ж�����������������

������䲻��ͬʱ���㣡����

�������:
�ƻ�����һ������,�ð���ֻ���ƻ�������,(ǰ��������)

ʹ��: [ͬ�������]
��������������������, ����ʹ��ͬ�������ʵ��

[��ʽ]:
        synchronized(�������){
            �����������������ݵĴ���;
        }
[ͬ���ĺô�]: ����˶��̵߳����ݰ�ȫ���⡣
[ͬ���ı׶�]: ���̺߳ܶ�ʱ,��Ϊÿ���̶߳���ȥ�ж�ͬ���ϵ���,���Ǻܺķ���Դ��,�����лή�ͳ��������Ч�ʡ�

*/
public class MyRunnable implements Runnable {

    private int tick = 100;
    private Object obj = new Object();//�߳�������

    @Override
    public void run() {

        while (true) {
            synchronized (obj) {//���ͬ������� �߳�?
                if (tick > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "���ڳ��۵�:" + tick + "��Ʊ");
                    tick--;
                }
            }

        }

    }
}
