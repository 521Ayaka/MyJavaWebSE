package ����֪ʶ.���̺��߳�.A6_�߳�ͬ��.B1_��Ʊ����;
/*
���ֵ�����:
    1.�����ظ���Ʊ��
    ����1���ڳ��۵�:100��Ʊ
    ����3���ڳ��۵�:100��Ʊ
    ����2���ڳ��۵�:100��Ʊ

    2.Ʊ�����ָ���Ʊ��
    ����2���ڳ��۵�:-1��Ʊ

*/

public class Runs {

    public static void main(String[] args) {

        //����Runnableʵ�������
        MyRunnable runn = new MyRunnable();

        //����Thread����
        Thread t1 = new Thread(runn, "����1");
        Thread t2 = new Thread(runn, "����2");
        Thread t3 = new Thread(runn, "����3");

        //��ʼ��Ʊ
        t1.start();
        t2.start();
        t3.start();

    }

}
