package ����֪ʶ.�ӿ�.interface07;

public class MyInterfaceImpl extends MyInterfaceImplFu implements MyInterfaceA, MyInterfaceB {


    @Override
    public void methodA() {
        System.out.println("������д�˽ӿ�A���еĳ��󷽷�");
    }

    @Override
    public void methodB() {
        System.out.println("������д�˽ӿ�B���еĳ��󷽷�");
    }

    @Override
    public void method() {
        System.out.println("������дһ�ζ���ӿڵ����ظ��ĳ��󷽷�");
    }

    @Override
    public void methodDefault() {
        System.out.println("������д�ظ���Ĭ�Ϸ�������Ϊһ����ͨ������");
    }


}
