package A1_MyJava.����֪ʶ.���̺��߳�.A9_�����ߺ�������.�����������߰���;

public class ������ implements Runnable{
    //��������
    private Box box;

    public ������(Box box) {
        this.box = box;
    }

    @Override
    public void run() {
        //��ȡţ��
        while (true){
            box.get();
        }
    }
}
