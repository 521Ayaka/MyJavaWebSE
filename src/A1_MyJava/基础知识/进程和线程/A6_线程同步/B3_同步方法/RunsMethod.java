package A1_MyJava.����֪ʶ.���̺��߳�.A6_�߳�ͬ��.B3_ͬ������;

public class RunsMethod {

    public static void main(String[] args) {
        MyRunnable run = new MyRunnable();

        Thread t11 = new Thread(run, "����1");
        Thread t12 = new Thread(run, "����2");
        Thread t13 = new Thread(run, "����3");

        t11.start();
        t12.start();
        t13.start();

        try {
            Thread.sleep(1000*20);
            System.exit(0);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
