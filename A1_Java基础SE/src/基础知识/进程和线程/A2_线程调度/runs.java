package ����֪ʶ.���̺��߳�.A2_�̵߳���;

public class runs {

    public static void main(String[] args) {
        //�������̶߳���
        ThreadPriority tp1 = new ThreadPriority();
        ThreadPriority tp2 = new ThreadPriority();
        ThreadPriority tp3 = new ThreadPriority();

        //��������
        tp1.setName("����");  //5 Ĭ�ϵ�����5
        tp2.setName("�ɻ�");  //5
        tp3.setName("������");//5

        //Thread������������̬��Ա����
        System.out.println(Thread.MIN_PRIORITY); //1
        System.out.println(Thread.NORM_PRIORITY);//5
        System.out.println(Thread.MAX_PRIORITY); //10
        System.out.println("���������м�ȡint���õ���");

        System.out.println("==========================");

        //����������� �����˵���ֻ������CPUƬ�ĸ��ʸ��˶���,��������һ�������С�

        //Ĭ�ϵ��� �������߳�
//        priority_NORM(tp1);
//        priority_NORM(tp2);
//        priority_NORM(tp3);

        //���õ���
        priority_MIN_TO_MAX(tp1,5);
        priority_MIN_TO_MAX(tp2,10);
        priority_MIN_TO_MAX(tp3,1);


        //�鿴���̵߳ĵ���
        System.out.println(tp1.getPriority());
        System.out.println(tp2.getPriority());
        System.out.println(tp3.getPriority());

    }

    public static void priority_NORM(ThreadPriority tp){
        tp.start();
    }

    public static void priority_MIN_TO_MAX(ThreadPriority tp,int p){
        //�����̵߳���
        tp.setPriority(p);
        tp.start();
    }


}
