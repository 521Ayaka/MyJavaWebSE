package ����֪ʶ.�̳�.Extends06;

public class NewPhone extends Phone {
    public NewPhone() {
    }

    @Override  //������д�µķ�����ʵ���¹��ܡ�//�¹�����show�������Ĺ��ܣ�������д
    public void show() {

        //super.������д�Ϲ��ܵķ�������
        super.show(); //���ø����show()������ԭ�еĹ��ܡ�

        //super����ȹ��ܡ�
        System.out.println("��ʾ����");
        System.out.println("��ʾͷ��");
    }
}
