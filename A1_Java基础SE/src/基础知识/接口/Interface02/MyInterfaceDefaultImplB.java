package ����֪ʶ.�ӿ�.Interface02;

public class MyInterfaceDefaultImplB implements MyInterfaceDefault{

    //����MyInterfaceDefaultImplA�ఴ CTAL+C+V������
    @Override
    public void methodAbs() {
        System.out.println("methodAbs�����า����д��BBB");
    }

    //������д�ӿڵ�Ĭ�Ϸ�����
    @Override
    public void methodDefault(){
        System.out.println("������д�ӿ�����ӵ�Ĭ�Ϸ�����");
    }
}
