package ����֪ʶ.���̺��߳�.A9_�����ߺ�������.�����������߰���;

public class ������ implements Runnable{
    //��������
    private Box box;

    public ������(Box box) {
        this.box = box;
    }

    @Override
    public void run() {
        //����������ţ��
        for (int i = 1; i <= 30 ; i++) {
            box.put(i);
        }
    }
}
