package A1_MyJava.����֪ʶ.���̺��߳�.A9_�����ߺ�������.�����������߰���;

public class BoxDame {

    //����
    public static void main(String[] args) {
        //��������
        Box box = new Box();
        //����������
        ������ s = new ������(box);
        //����������
        ������ x = new ������(box);

        //�������߳�
        Thread ts = new Thread(s,"������");
        Thread tx = new Thread(x,"������");

        //�������߳�
        ts.start();
        tx.start();


    }

}
