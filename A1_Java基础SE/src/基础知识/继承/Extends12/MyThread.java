package ����֪ʶ.�̳�.Extends12;

class MyThread extends Thread{
    private  int a;
    public MyThread(int a)
    {
        this.a=a;
    }

    @Override
    public void run() {

        for (int i = 0; i <a+1; i++) {
            //��������ٿ����Ż������ӡ����XX��Ʊ�۳�������л�úܶ�
            System.out.println(currentThread().getName()+"��Ʊһ��");
        }
        System.out.println(currentThread().getName()+"����"+a+"��Ʊ��ȫ������");


    }
}