package ����֪ʶ.���̺��߳�.A1_Thread��;
/*

�鿴��ǰ�̵߳����� Thread.currentThread().getName()
�����߳����� setName();
�����߳����� getName();

Ĭ���߳����� Thread-0 Thread-1 ...   ��0��ʼ

*/

public class RunsName {

    public static void main(String[] args) {
        //�鿴��ǰ�̵߳����� main
        System.out.println(Thread.currentThread().getName());

        method1();//Ĭ���߳�����
        method2();//�����߳�����


    }

    //Ĭ���߳�����
    public static void method1(){
        //�������߳�
        MyThreadName t1 = new MyThreadName();
        MyThreadName t2 = new MyThreadName();

        //Ĭ������� �鿴����
        t1.start(); // Thread-0 : 0 ...
        t2.start(); // Thread-1 : 0 ...
    }


    //�����߳�����
    public static void method2(){
        //�����߳�
        MyThreadName tn1 = new MyThreadName();
        MyThreadName tn2 = new MyThreadName();
        //��������
        tn1.setName("����001")/*��������*/;
        tn2.setName("����002")/*��������*/;
        //�����߳�
        tn1.start(); // ����001 : 67 ...
        tn2.start(); // ����002 : 66 ...
    }

}

//�̳�Thread�� ��дrun���� ����getName����
class MyThreadName extends Thread {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 100; i++) {
            System.out.println(getName()/*��������*/ + " : " + i);
        }
    }
}
