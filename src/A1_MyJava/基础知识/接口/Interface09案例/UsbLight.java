package A1_MyJava.����֪ʶ.�ӿ�.Interface09����;

public class UsbLight implements USB{

    @Override
    public void open() {
        System.out.println("��USB��");
    }

    @Override
    public void close() {
        System.out.println("�ر�USB��");
    }

    public void adjust(){
        System.out.println("��������");
    }
}
