package A1_MyJava.����֪ʶ.���̺��߳�.A3_�߳̿���;

public class Runs_join {

    public static void main(String[] args) {

        //�����̶߳���
        ThreadJoin tj1 = new ThreadJoin();
        ThreadJoin tj2 = new ThreadJoin();
        ThreadJoin tj3 = new ThreadJoin();
        //�����߳�����
        tj1.setName("�ܲ�");
        tj2.setName("��ا");
        tj3.setName("��ֲ");

        //�����߳�
        tj1.start();

        try {//��Ȼ��Ҫ�쳣���� try...catch...
            tj1.join();//�ȴ��ܲ�����......
                       //�����ư� ̫�Ӷ��...
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        tj2.start();
        tj3.start();

    }

}

class ThreadJoin extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + ":" + i);
        }
    }

}
