package A1_MyJava.����֪ʶ.Lambda���ʽ.A1_�����˽�����;

public class TestLambda {

    public static void main(String[] args) {

        //��ʽһ:
        RunnableImpl runImpl = new RunnableImpl();
        Thread t = new Thread(runImpl);
        t.start();


        //��ʽ��: ͨ�������ڲ���Ľ�
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("��ʽ��: ���̳߳���������");
            }
        }).start();


        //��ʽ��: ͨ��Lambda���ʽ�Ľ�
        new Thread(() -> {
            System.out.println("��ʽ��: ���̳߳���������");
        }).start();


    }

}
