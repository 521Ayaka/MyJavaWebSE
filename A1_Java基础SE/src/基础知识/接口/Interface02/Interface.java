package ����֪ʶ.�ӿ�.Interface02;

/*

��Java 8��ʼ���ӿ���������Ĭ�Ϸ�����
��ʽ��
public default ����ֵ���� Ĭ�Ϸ�������(�����б�){
     //������
}

��ע���ӿڵ��е�Ĭ�Ϸ��������Խ���ӿ��������⡣

˵��: ����ӵķ������ĳ�Ĭ�Ϸ�����
     public�ǻ�ɫ�ģ�����ʡ�ԣ����ǲ��ܸĳ����������η���ֻ��˵public����ʡ�Բ�д��
     ���ڽӿڵ�Ĭ�Ϸ������ᱻ ��ʵ���ࡰ �̳�������
*/

public class Interface {

    public static void main(String[] args) {

        MyInterfaceDefaultImplA ImplA = new MyInterfaceDefaultImplA();
        ImplA.methodAbs();

        System.out.println("=======================================");

        MyInterfaceDefaultImplB ImplB = new MyInterfaceDefaultImplB();
        ImplB.methodAbs();

        System.out.println("=======================================\n");
        System.out.println("=======================================");

        //============================================================

        //���ڽӿڵ�Ĭ�Ϸ������ᱻ ��ʵ���ࡰ �̳�������
        //ͨ����ʵ���ࡰ����Ĭ�Ϸ��������ʵ����û�и÷�������ô�������Ҹ���ӿڡ�
        ImplA.methodDefault();
        System.out.println("===================");
        ImplB.methodDefault();

    }

}
