package ����֪ʶ.���̺��߳�.A6_�߳�ͬ��.B1_��Ʊ����;

public class MyRunnable implements Runnable {

    private int tick = 100;//��Ʊ����

    @Override
    public void run() {

        while (true) {
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
