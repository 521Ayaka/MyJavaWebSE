package ����֪ʶ.���̺��߳�.A6_�߳�ͬ��.B3_ͬ������;

public class MyRunnable implements Runnable {
    private int tick = 100;
    private Object object = new Object();
    private int jia = 0;

    @Override
    public void run() {
        while (true) {
            if (jia % 2 == 0) {
                synchronized (/*object*/this) {
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
            } else {
//                synchronized (object) {
//                    if (tick > 0) {
//                        try {
//                            Thread.sleep(100);
//                        } catch (InterruptedException e) {
//                            e.printStackTrace();
//                        }
//                        System.out.println(Thread.currentThread().getName() + "���ڳ��۵�:" + tick + "��Ʊ");
//                        tick--;
//                    }
//                }
                method();
            }
            jia++;
        }
    }

    //ʹ��[ͬ������]
    public synchronized void method() {
        /*
        ��������ְ�ȫ����
        ��������� obj ����
        ����������� �� ��obj

        ����this������
        �������obj ����this��֤
        */
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
