package ����֪ʶ.�ӿ�.Interface09����;

public class Keyboard implements USB{

    @Override
    public void open() {
        System.out.println("�򿪼���");
    }

    @Override
    public void close() {
        System.out.println("�رռ���");
    }

    public void type(){
        System.out.println("��������");
    }
}
