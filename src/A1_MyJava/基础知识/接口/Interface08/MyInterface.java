package A1_MyJava.����֪ʶ.�ӿ�.Interface08;

public interface MyInterface extends MyInterfaceA, MyInterfaceB {

    public abstract void method();

    public abstract void methodCommonA();

    public abstract void methodCommonB();

    @Override//ע�⣺Ҫ����default�ؼ��֡�
    public default void methodDefault() {
        System.out.println("������ӿ��ظ�Ҫ���и�����д��");
    }



}
